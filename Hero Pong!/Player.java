import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    String right = "", left = "", up = "", down = "";
    int xspeed = 0;
    int yspeed = 0;
    public void act() 
    {
        // Add your action code here.
        int speed = 10;
        int x = getX();
        int y = getY();
        // Add your action code here.
        
        if( Greenfoot.isKeyDown( right ) ){
            xspeed = speed;
        }else if(Greenfoot.isKeyDown( left )){
            xspeed = -speed;
        }else{
            xspeed = 0;
        }
        
        if( Greenfoot.isKeyDown( up ) ){
            yspeed = -speed;
        }else if( Greenfoot.isKeyDown( down ) ){
            yspeed = speed;
        }else{
            yspeed = 0;
        }
        
        if(Math.abs(x+xspeed-800) >20 ) setLocation(x+xspeed, y+yspeed);
    }    
}
