import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpiderEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpiderEnemy extends Actor
{
  
    /**
     * Act - do whatever the SpiderEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY());
        removeEnemy();
        
  }
  
  
  public void removeEnemy(){
   World w = getWorld();
   if (Greenfoot.mouseClicked(this)){
      w.removeObject(this);
   }
   
  }
  
  
}
