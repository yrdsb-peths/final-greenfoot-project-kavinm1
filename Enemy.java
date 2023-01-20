import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Kavin
 * @version January 2023
 */
public class Enemy extends Actor
{
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
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    public Enemy()
    {
        GreenfootImage Enemy = getImage();
        Enemy.scale(100,100);
        setImage(Enemy);
    }}