import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class maru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tama extends Actor
{
    /**
     * Act - do whatever the maru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int xspeed = 0;
    int yspeed = 0;
    
    boolean wallHit = false;
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x+xspeed, y+yspeed);
        Player player = (Player)getOneIntersectingObject(Player.class);
        //v_b1+v_p1 = v_b2+v_p1
        if(player != null){
            xspeed = -xspeed + 2*player.xspeed;//+= player.xspeed;
            yspeed = -yspeed + 2*player.yspeed;//+= player.yspeed;
        }
        
        if(y < 3 || y > 897){
            if(wallHit == false){
                getWorld().showText("ok", 0, 0);
                yspeed *= -1;
                wallHit = true;
            }
        }else{
            wallHit = false;
        }
        
        if(x > 1598 || x < 1){
         getWorld().showText( "ゴール", 100,100);
        }
        
        getWorld().showText( "x="+x+",y="+y, 100, 50 );
    }      
}
