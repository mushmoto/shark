import greenfoot.*;

public class heart extends teki
{
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
