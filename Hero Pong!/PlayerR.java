import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerR extends Actor
{
    /**
     * Act - do whatever the PlayerR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int speed = 5;
        int x = getX();
        int y = getY();
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation(x+speed, y);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            if(x>820){
            setLocation(x-speed, y);
        }
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation(x, y-speed);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation(x, y+speed);
        }
    }    
}
