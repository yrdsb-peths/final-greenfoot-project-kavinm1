import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author Kavin
 * @version January 2023
 */
public class Spaceship extends Actor
{
    GreenfootSound alienSound = new GreenfootSound("aliensound.wav");
    /**
     * Constructor- The code that gets run one time when object is created
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left"))
        {
            x -= 4;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            x +=4;
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            y -= 4;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y +=4;
        }
        
        setLocation(x, y);
        
        // Remove alien if defeated by spaceship
        defeat();
    }
    
    /*
     * Defeat enemy and spawn new one if defeated
     */
    public void defeat()
    {
        if(isTouching(Enemy.class))
        {
            removeTouching(Enemy.class);
            MyWorld world = (MyWorld) getWorld();
            world.createEnemy();
            world.increaseScore();
            //Play sound effects when crashing
            alienSound.play();
        }
    }
    //Resize spaceship
    public Spaceship()
    {
        GreenfootImage Spaceship = getImage();
        Spaceship.scale(50,50);
        setImage(Spaceship);
    }
}