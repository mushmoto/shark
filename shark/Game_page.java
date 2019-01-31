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
    public static int getScore(){ return score;}
    public static void addScore(){ score ++;}
    public static void addScore2(){score += 3;}
    public static int getTime(){return time;}
    public static void addLife(){if(life != 2)life ++;}

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
        
        /*int exx =Greenfoot.getRandomNumber(getWidth()); 
        int exy =Greenfoot.getRandomNumber(getHeight()); */
        addObject(new Ex(),100,100);

        /*爆弾ランダム召喚*/
       

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
            
            if(time % 20 == 0){
                spawnEnemy();
            }
    }

    public void spawnEnemy()
    {
        int enemyNum = Greenfoot.getRandomNumber(100);
        int place = Greenfoot.getRandomNumber(4);
        int spawn_x = 650;
        int spawn_y = 85+(90*place);
        
        if(enemyNum >= 1 && enemyNum <= 40){
            addObject(new N_ter(), spawn_x, spawn_y);
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
    }
}
