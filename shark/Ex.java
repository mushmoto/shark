import greenfoot.*;

/**
 * Write a description of class Ex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex extends teki
{
    /**
     * Act - do whatever the Ex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {


           
           getImage().scale(50,50);
            setRotation(180);
            move(5);
            setRotation(0);
   


        getImage().scale(50,50);
        
        Actor hit_by_shark = getOneObjectAtOffset( 0, 0, Shark.class );
        if( hit_by_shark != null ){
            Game_page.addLife();
            getWorld().removeObject(this);
        }

    }    
}
