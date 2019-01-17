import greenfoot.*;

/**
 * Write a description of class Game_page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_page extends World
{
    static int score = 0;
    /**
     * Constructor for objects of class Game_page.
     * 
     */
    public Game_page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    }
    public Game over()
    {
        static public int getscore(){return score;}
        
        World game = new WorlGame();
        Greenfoot.setWorld(game);
    }
}
