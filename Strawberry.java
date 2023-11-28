import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Strawberries are fruits, they are good for you.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class Strawberry extends Actor
{
    public void act() 
    {
        setLocation(getX(), getY() + 1);
        MyWorld world = (MyWorld) getWorld();
        if(getY() > world.getHeight()) {
            world.onGameOver();
        }
    }    
}
