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
    double xspeed = 0;
    double yspeed = 0;
    
    boolean wallHit = false;
    boolean state = false;
    int Lpoint = 0;
    int Rpoint = 0;
    int lim = 12;
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        double mRatio = 15; //tama/player
        setLocation((int)(x+xspeed), (int)(y+yspeed));
        Player player = (Player)getOneIntersectingObject(Player.class);
        //v_b1+v_p1 = v_b2+v_p1
        
        if(player != null){
            xspeed = ((mRatio-1)*xspeed+2*player.xspeed)/(1+mRatio);
            yspeed = ((mRatio-1)*yspeed+2*player.yspeed)/(1+mRatio);
            xspeed = xspeed/sign(xspeed) > lim ? lim * sign(xspeed) : xspeed;
            yspeed = yspeed/sign(yspeed) > lim ? lim * sign(yspeed) : yspeed;
            state = true;
            player.movePlayer(0,0);
        }else{
            state = false;
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
         Rpoint++;
        }
        
        if(x > 1598 ){
         getWorld().showText( "L得点", 100,100);
         setLocation(900, 450);
         xspeed = yspeed = 0;
         Lpoint++;
        }
        getWorld().showText( "Lpoint = " +Lpoint , 100, 25 );
        getWorld().showText( "Rpoint = " +Rpoint , 1500, 25 );
        //getWorld().showText( "x="+x+",y="+y, 100, 50 );
        //getWorld().showText( "vx=" + (int)xspeed + ",vy=" + (int)yspeed , 100, 75 );
        if(Lpoint >= 10 || Rpoint >= 10) ((MyWorld)getWorld()).gameEnd(Lpoint, Rpoint);
    }  
    
    int sign(double A){
        if(A>=0) return 1;
        else return -1;
    }
}
