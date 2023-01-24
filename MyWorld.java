import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Kavin
 * @version January 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    GreenfootSound backgroundSound = new GreenfootSound("backgroundsound.mp3");
    GreenfootSound gameOverSound = new GreenfootSound("gameover.wav");
    boolean gameOverTrue = false;    
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the Spaceship
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createEnemy();
    }
    
    /*
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        if(gameOverTrue = true)
        {
            GameOver gameOver = new GameOver();
            Greenfoot.setWorld(gameOver);
            backgroundSound.stop();
            gameOverSound.play();
        }
    }
    
    /*
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level   += 1;
        }
    }
    
    /**
     * Create a new enemy at random location at top of screen
     */
    public void createEnemy()
    {
        Enemy enemy = new Enemy();
        enemy.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(enemy, x, y);
    }
    
    public void act()
    {
        backgroundSound.play();
    }
    
    public void checkGameOver()
    {
        gameOverTrue = true;
    }
   
}