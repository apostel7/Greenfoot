import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    private int turnCounter;
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("newFlower.jpg");
        gfi.scale( 100, 100);
        this.setImage(gfi);
        this.turnCounter = 0;
    }//gfi is freed up
    
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.turn(10);
        this.turnCounter ++;
        if (this.turnCounter == 75)
        { 
            World w = this.getWorld();
            w.removeObject(this); 
        }
       
    }
}
