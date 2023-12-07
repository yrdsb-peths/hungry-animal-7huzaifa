import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Strawberries are fruits, they are good for you.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class Strawberry extends Actor
{
    private int speed = 1;
    public void act() 
    {
        setLocation(getX(), getY() + speed);
        MyWorld world = (MyWorld) getWorld();
        speed = world.getLevel();
        if(getY() > world.getHeight()) {
            world.onGameOver();
        }
        
        
    }      
}
