import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WebGameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WebGameWorld extends World
{

    
    /**
     * Constructor for objects of class WebGameWorld.
     * 
     */
    public WebGameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    
    }
    
  public void act() {
        
        generateEnemies();
        endGame();
        
    }
    
  
    
  public void generateEnemies() {
      if(Greenfoot.getRandomNumber(1000) < 20) {
            SpiderEnemy e = new SpiderEnemy();
            addObject(e, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            
        }
    }
    
    public void endGame() {
       int x = numberOfObjects();
       if (x>10){
          WebGameOver go = new WebGameOver();
          Greenfoot.setWorld(go);
        }
  }
}
