import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bombs are dangerous.
 * 
 * @Qureshi (your name) 
 * @December 2023 (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    GreenfootSound bombSound = new GreenfootSound("bomb.wav");
    public void act()
    {
        setLocation(getX(), getY() + speed);
        explode();
        despawn();
    }
    public void explode(){
        if(isTouching(Elephant.class)){
            removeTouching(Elephant.class);
            MyWorld world = (MyWorld) getWorld();
            world.onGameOver();
            bombSound.play();
            return;
        }
    }    
    
    public void despawn(){
        MyWorld world = (MyWorld) getWorld();
        if(getY() == world.getHeight()){
            world.removeObject(this);
            return;
        }
    }
}
