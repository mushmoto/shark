import greenfoot.*;

/**
 * Write a description of class Game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_over extends World
{

    /**
     * Constructor for objects of class Game_over.
     * 
     */
    public Game_over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Game Over…", 200, 150);
        
        String score = "SCORE " + Game_page.getScore();
        showText(score, 400, 150);
    }
}
