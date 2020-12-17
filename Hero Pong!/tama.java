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
        if(player != null){//5:1 mass
            xspeed = (int)((-4*xspeed+10*player.xspeed)/6.0);//-xspeed + 2*player.xspeed;//+= player.xspeed;
            yspeed = (int)((-4*yspeed+10*player.yspeed)/6.0);//-yspeed + 2*player.yspeed;//+= player.yspeed;
        }
        
        if(y < 2 || y > 898){
            if(wallHit == false){
                getWorld().showText("ok", 0, 0);
                yspeed *= -1;
                wallHit = true;
            }
        }else{
            wallHit = false;
        }
        
        if(x < 1){
         getWorld().showText( "R得点", 100,100);
         setLocation(700, 450);
         xspeed = yspeed = 0;
        }
        
        if(x > 1598 ){
         getWorld().showText( "L得点", 100,100);
         setLocation(900, 450);
         xspeed = yspeed = 0;
        }
        getWorld().showText( "x="+x+",y="+y, 100, 50 );
    }      
}
