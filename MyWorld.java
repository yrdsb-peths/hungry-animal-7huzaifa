import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score = 0;
    private Label scoreLabel;
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
        
        scoreLabel = new Label(0, 70);
        addObject(scoreLabel, 50, 50);
    }
    public void createStrawberry()
    {
        Strawberry straw = new Strawberry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(straw, x, y);
    }
    public void onGameOver() {
        Label gameOverLabel = new Label("Game Over!", 70);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
        
    }
    
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
    }    

}
