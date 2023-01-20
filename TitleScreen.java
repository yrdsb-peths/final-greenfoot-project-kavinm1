import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Kavin
 * @version January 2023
 */
public class TitleScreen extends World
{
    //Create title label
    Label titleLabel = new Label("Space Guardian", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth()/2, 150);
        prepare();
    }

    /*
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"));
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Add in intro labels
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,200,286);
        label.setLocation(278,285);
        label.setLocation(262,301);
        Label label2 = new Label("Use <-- and --> to Move", 40);
        addObject(label2,291,256);
        label2.setLocation(322,251);
        label.setLocation(291,292);
        label.setLocation(300,320);
        label2.setLocation(305,297);
        label.setLocation(299,334);
        Label label3 = new Label("Touch the aliens to defeat them, they will speed up as you progress!", 20);
        addObject(label3,301,252);
    }
}