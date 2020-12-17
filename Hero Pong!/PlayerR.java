import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerR extends Player
{
    /**
     * Act - do whatever the PlayerR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        right = "right";
        left = "left";
        up = "up";
        down = "down";
        super.act();
    }    
}
