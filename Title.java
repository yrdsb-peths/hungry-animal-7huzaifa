import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Titlescreen for the hungry animal game.
 * 
 * @Qureshi (your name) 
 * @December 2023 (a version number or a date)
 */
public class Title extends World
{
    Label titleLabel = new Label("Hungry Elephant", 90);
    Label instructionsLabel = new Label("(Use \u2190 and \u2192 to Move)", 40);
    Label startLabel = new Label("Click to start", 50);
    
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth()/2, 40);
        addObject(startLabel, getWidth()/2, 280);
        addObject(instructionsLabel, getWidth()/2, 375);
        prepare();
    }

    public void act(){
        if(Greenfoot.mouseClicked(null)){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,479,193);
        elephant.setLocation(300,170);
    }
}
