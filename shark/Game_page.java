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

    public static int getScore(){ return score;}
    /**
     * Constructor for objects of class Game_page.
     * 
     */
    
    public Game_page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1, false);
        addObject(new Shark(), 70, 175);
    }
    
    public static void game_over()
    {
        
        World game = new Game_over();
        Greenfoot.setWorld(game);

    }
    
    public void spawnEnemy(){
        int enemyNum = Greenfoot.getRandomNumber(100);
        if(enemyNum >= 1 && enemyNum <= 40){
            addObject(new N_ter(), 100, 100);
        }
        else if(enemyNum >= 41 && enemyNum <= 60){
                addObject(new S_ter(), -100, -100);
        }else if(enemyNum >= 61 && enemyNum <= 73){
                addObject(new Pw(), -100, -100);
        }else if(enemyNum >= 74 && enemyNum <= 86){
                addObject(new Ex(), -100, -100);
        }else if(enemyNum >= 87 && enemyNum <= 100){
                addObject(new Bomb(), -100, -100);
        }
         
        
    }  
}
