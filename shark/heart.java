import greenfoot.*;

/**
 * Write a description of class heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heart extends teki
{
    /**
     * Act - do whatever the heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
                
        int life_score = Game_page.getLife();
        
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    
    if( life_score != 2 ){
        getWorld().removeObject( this ) ;
    }
    }    
}
