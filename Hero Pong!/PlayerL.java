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
        if( Greenfoot.isKeyDown( "d" ) ){
            setLocation(x+speed, y);
        }
        if( Greenfoot.isKeyDown( "a" ) ){
            setLocation(x-speed, y);
        }
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation(x, y-speed);
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            setLocation(x, y+speed);
        }
    }    
}
