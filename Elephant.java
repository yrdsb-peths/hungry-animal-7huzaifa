import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephants are great.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class Elephant extends Actor
{
    GreenfootSound eatingSound = new GreenfootSound("sounds/eating.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];    
    SimpleTimer animationTimer = new SimpleTimer(); 
    private int imageIndex;
    private static int score;
    
    String facing = "right";
    public Elephant() {
        score = 0;
        imageIndex = 0;
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i +".png");
            idleRight[i].scale(100, 100);
        }
        for(int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i +".png");
            idleLeft[i].scale(100, 100);
            idleLeft[i].mirrorHorizontally();
        }
        animationTimer.mark();
        setImage(idleRight[0]);
    }
    
    public void animateElephant(){
        if(animationTimer.millisElapsed() > 100){
            if(facing.equals("right")){
                setImage(idleRight[imageIndex]);
                imageIndex = (imageIndex + 1) % idleRight.length;
            }
            else{
                setImage(idleLeft[imageIndex]);
                imageIndex = (imageIndex + 1) % idleLeft.length;
            }
            animationTimer.mark();
        }
    }
    
    public void act() 
    {
        
        if(Greenfoot.isKeyDown("a")){
            move(-6);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("d")){
            move(6);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("left")){
            move(-6);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right")){
            move(6);
            facing = "right";
        }
        animateElephant();
        eat();
        teleport();
    }
    public void eat(){
        if(isTouching(Strawberry.class)){
            removeTouching(Strawberry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createStrawberry();
            world.increaseScore();
            eatingSound.play();
            score = world.getScore();
        }
    }
    
    /**
     * Method to teleport elephant to the opposite side of the world
     * if it goes out of bounds
     */
    public void teleport(){
        //if elephant's current x-value is less than 0 - width of 
        //elephant image, move it back to the other side of the world
        if(this.getX() < 0 - this.getImage().getWidth()){
            setLocation(600, getY());
        }
        //if the elephant's current x-value is more than 600 + width
        //of elephant image, move it back to the other side of the world
        if(this.getX() > (600 + this.getImage().getWidth())){
            setLocation(0 - this.getImage().getWidth(), getY());
        }
    }
    
    public static int getScore(){
        return score;
    }
     
}
