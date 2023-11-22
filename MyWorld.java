import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is set in the Australian outback.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        Kangaroo kanga = new Kangaroo();
        addObject(kanga, 300, 300);
        createStrawberry();
    }
    public void createStrawberry()
    {
        Strawberry straw = new Strawberry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(straw, x, y);
    }
}
