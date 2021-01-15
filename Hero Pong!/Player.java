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
    int x, y;
    public void act() 
    {
        // Add your action code here.
        int speed = 10;
        getWorld().showText( "speed:"+speed , 100,200);
        x = getX();
        y = getY();
        // Add your action code here.
        
        if( Greenfoot.isKeyDown( right ) ){
            xspeed = speed;
            //timer++;
        }else if(Greenfoot.isKeyDown( left )){
            xspeed = -speed;
            //timer++;
        }else{
            xspeed = 0;
            //timer = 0;
        }
        
        //xspeed = (int)(xspeed * 0.8);
        
        if( Greenfoot.isKeyDown( up ) ){
            yspeed = -speed;
            //timer++;
        }else if( Greenfoot.isKeyDown( down ) ){
            yspeed = speed;
            //timer++;
        }else{
            yspeed = 0;
            //timer = 0;
        }
    
        if(Math.abs(x+xspeed-800) >20 ) setLocation(x+xspeed, y+yspeed);
    }  
    
    public void movePlayer(int xspeed, int yspeed){
        if(Math.abs(x+xspeed-800) >20 ) setLocation(x+xspeed, y+yspeed);
    }
    
}
