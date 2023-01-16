import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author Kavin
 * @version January 202
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
            x -= 2;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            x +=2;
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            y -= 2;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y += 2;
        }
        
        setLocation(x, y);
    }
}
