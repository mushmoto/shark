import greenfoot.*;

/**
 * Write a description of class life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class life extends Actor
{
    /**
     * Act - do whatever the life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        String life = "LIFE " + Game_page.getLife();
        getWorld().showText(life, 550, 20);
    }    
}
