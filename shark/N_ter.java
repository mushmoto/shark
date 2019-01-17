import greenfoot.*;

/**
 * Write a description of class N_ter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N_ter extends teki
{
    /**
     * Act - do whatever the N_ter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor hit_by_shark = getOneObjectAtOffset( 0, 0, Shark.class );
        if( hit_by_shark != null ){
            Game_page.addScore();
            getWorld().removeObject(hit_by_shark);
        }
    }
}
