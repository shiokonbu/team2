import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerL extends Player
{
    /**
     * Act - do whatever the PlayerL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        right = "d";
        left = "a";
        up = "w";
        down = "s";
        super.act();
    }    
}
