import greenfoot.*;

/**
 * Write a description of class Game_title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_title extends World
{

    /**
     * Constructor for objects of class Game_title.
     * 
     */
    public Game_title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1);
        
        Click Click = new Click();
        
        addObject(Click,300,300);
    }
    
    
  
}
