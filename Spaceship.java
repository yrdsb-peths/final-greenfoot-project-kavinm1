import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author Kavin
 * @version January 2023
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
            y += 4;
        }
        
        //Remove enemy if defeated by spaceship
        removeTouching(Enemy.class);
        
        setLocation(x, y);
    }
    
    //This method resizes the spaceship
    public Spaceship()
    {
        GreenfootImage Spaceship = getImage();
        Spaceship.scale(100,100);
        setImage(Spaceship);
    }
}
