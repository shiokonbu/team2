import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1600, 900, 1); 
        
        addObject( new tama(), 700, 450 );
        addObject( new PlayerL(), 400, 450 );
        addObject( new PlayerR(), 1200, 450 );
        
        addObject( new tyuuou(), 800, 450 );

    }
    
    public void gameEnd(int Lpoint, int Rpoint){
        if(Lpoint > Rpoint) {
            World endL = new endL();
            Greenfoot.setWorld( endL );
        }else{
            World endR = new endR();
            Greenfoot.setWorld(endR);
        }
    }
    
}
