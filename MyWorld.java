import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int stepCounter; 
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Critter c = new Critter();
        this.addObject(c,150,350);
        Flower f = new Flower();
        this.addObject(f,200,200);
    }
    public void act()
    {
        this.stepCounter = this.stepCounter +1;
        if (stepCounter%72 == 0)
        {
        Flower f = new Flower();
        int xPos = Greenfoot.getRandomNumber(350);
        int yPos = Greenfoot.getRandomNumber(150);
        this.addObject(f,xPos,yPos);
        }
    }
}
