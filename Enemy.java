import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Kavin
 * @version January 2023
 */
public class Enemy extends Actor
{
    private int height;
    private int width;
    GreenfootSound gameOverSound = new GreenfootSound("gameover.wav"); 
    public Enemy (int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    public void resizeImage()
    {
        GreenfootImage Enemy = getImage();
        Enemy.scale(height - 50, width - 50);
    }
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    
    public void act()
    {
        // Enemy travels downwards.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Remove enemy and draw game over when enemy gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            //Play game over sound
            gameOverSound.play();
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    //Resize enemy size
    public Enemy()
    {
        GreenfootImage Enemy = getImage();
        Enemy.scale(100,100);
        setImage(Enemy);
    }
}