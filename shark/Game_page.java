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
    static int time = 0;
    static int life = 1;
    
    /* getter / setter */
    public static int getScore(){ return score;}

    public static void addScore(){ score += 50;}
    public static void addScore2(){score += 150;}

    public static int getTime(){return time;}
    public static void addLife(){if(life != 2)life ++;}

    public static int getLife(){ return life; }
  
    public static void subLife(){ life --; }
    
    public static void resetLife(){ life = 1; }
    public static void resetScore(){ score = 0; }

    
    

    /**
     * Constructor for objects of class Game_page.
     * 
     */
    
    public Game_page()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        addObject(new Score(), -10, -10);
        addObject(new Shark(), 70, 175);

    }
    
    public static void game_over()
    {
        World game = new Game_over();
        Greenfoot.setWorld(game);
    }
    
    public void act()
    {    
            if(time <= 99999){time++;}
            else{ time = 0; }
            
            if(time % 30 == 0){
                spawnEnemy();
            }

            if( life == 0 ){
                game_over();
            }
   }

    public void spawnEnemy()
    {
        int enemyNum = Greenfoot.getRandomNumber(100);
        int place = Greenfoot.getRandomNumber(4);
        int spawn_x = 650;
        int spawn_y = 85+(90*place);

        /*ハート処理*/
        if( life == 2 ){
            addObject( new heart(), 550,20 );
        }
        
        else if(enemyNum >= 41 && enemyNum <= 60){
                addObject(new S_ter(), spawn_x, spawn_y);
        }else if(enemyNum >= 61 && enemyNum <= 73){
                addObject(new Pw(), spawn_x, spawn_y);
        }else if(enemyNum >= 74 && enemyNum <= 86){
                addObject(new Ex(), spawn_x, spawn_y);
        }else if(enemyNum >= 87 && enemyNum <= 100){
                addObject(new Bomb(), spawn_x, spawn_y); 
        }  
    

        //int[] pb = {52, 20, 10, 3, 15};
        
        if(enemyNum > 0 && enemyNum <= 52 ){
            addObject(new N_ter(), spawn_x, spawn_y);
        }else if(enemyNum > 52 && enemyNum <= 72){
            addObject(new S_ter(), spawn_x, spawn_y);  
        }else if(enemyNum > 72 && enemyNum <= 82){
            addObject(new Pw(), spawn_x, spawn_y);   
        }else if(enemyNum > 82 && enemyNum <= 85){
            addObject(new Ex(), spawn_x, spawn_y);
        }else if(enemyNum > 85 && enemyNum <= 100){
            addObject(new Bomb(), spawn_x, spawn_y);
        }
   

    }  

}

