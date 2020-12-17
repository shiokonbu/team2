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
    
    public void act() 
    {
      //↓球のゴール判定
      int x = getX();
      int y = getY();
      
      getWorld().showText( "x="+x+",y="+y, 100, 50 );
      setRotation(0);
      //move(-10);
      if(x > 1598 || x < 1){
         getWorld().showText( "ゴール", 100,100);
      }
      
    }    
}
