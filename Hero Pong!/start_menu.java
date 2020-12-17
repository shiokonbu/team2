import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start_menu extends World
{

    /**
     * Constructor for objects of class start_menu.
     * 
     */
    public start_menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
    }
    
    public void act()
    {
        if( Greenfoot.isKeyDown("Enter")){
            World Myworld = new MyWorld();
            Greenfoot.setWorld( Myworld );
        }
    }
}
