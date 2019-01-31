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
        
        int score = Game_page.getScore();
        if(score < 3001)showText("ホワイトランクです", 400, 120);
        else if(score > 3000 && score < 20001)showText("ゴールドランクです", 400, 120);
        else if(score > 20000 && score < 100000)showText("プラチナランクです", 400, 120);
        else if(score > 100000)showText("ダイヤモンドランクです",400, 120);
        showText("SCORE " + score, 400, 150);
    }
}
