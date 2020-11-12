import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerL extends Actor
{
    /**
     * Act - do whatever the PlayerL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int speed = 5;
        int x = getX();
        int y = getY();
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation(x+speed, y);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation(x-speed, y);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation(x, y-speed);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation(x, y+speed);
        }
    }    
}
