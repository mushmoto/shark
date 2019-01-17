import greenfoot.*;

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    int place;
    int twait = 0;
    public Shark()
    {
           place = 1;
           GreenfootImage image = getImage();
           image.scale(image.getWidth() - 550, image.getHeight() - 330);
           setImage(image);
           
    }
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            if(place < 0){place = 0;}
            if(place > 3){place = 3;}
            
            setLocation(70, 40+45+(90*place));
            if(twait >= 0){twait--;}
            
            
            if( twait <= 0 && Greenfoot.isKeyDown( "up" ) ){
                place--;
                twait = 10;
            }
            if( twait <= 0 && Greenfoot.isKeyDown( "down" ) ){
                place++;
                twait = 10;
            }
    }    
}
