import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game over world/screen for when the player loses the game.
 * 
 * @Qureshi (your name) 
 * @December 2023 (a version number or a date)
 */
public class GameOverWorld extends World
{
    
    private int score;
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label gameOverLabel = new Label("Game Over!", 80);
        addObject(gameOverLabel, getWidth()/2, 150);
        
        score =MyWorld.getScore();
        Label finalScoreLabel = new Label("Score:" + score, 60);
        addObject(finalScoreLabel, getWidth()/2, getHeight()/2 + 60);
        
    }
}
