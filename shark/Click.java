import greenfoot.*;

/**
 * Write a description of class Click here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Click extends Actor
{
    /**
     * Act - do whatever the Click wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            
            /*ここから*/
            Game_page.resetLife();
            Game_page.resetScore();
            Greenfoot.setWorld(new Game_page());
        }
    }    
}
