import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kangaroos are animals found in the Oceanic region.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class Kangaroo extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("a")){
            move(-3);
        }
        else if(Greenfoot.isKeyDown("d")){
            move(3);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(3);
        }
        eat();
    }
    public void eat(){
        if(isTouching(Strawberry.class)){
            removeTouching(Strawberry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createStrawberry();
            world.increaseScore();
        }
    }
     
}
