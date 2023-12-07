import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static int score = 0;
    private Label scoreLabel;
    private static int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
   
        super(600, 400, 1, false); 
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        createStrawberry();
        
        score = 0;
        
        //create background
        GreenfootImage bg = new GreenfootImage("images/background.png");
        bg.scale(getWidth(),getHeight());
        setBackground(bg);

        scoreLabel = new Label(0, 70);
        addObject(scoreLabel, 50, 50);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(500) == 60){
            createBomb();
        }
    }
    
    public static int getLevel(){
        return level;
    } 

    public void createStrawberry()
    {
        Strawberry strawberry = new Strawberry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(strawberry, x, y);
    }
    public void createBomb(){
        Bomb bomb = new Bomb();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bomb, x, y);
    }
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0){
            level += 1;
        }
    } 
    
    public static int getScore(){
        return score;
    }
    
    public void onGameOver(){
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
        Greenfoot.setWorld(new GameOverWorld());
    }
}
