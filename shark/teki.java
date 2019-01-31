import greenfoot.*;

/**
 * Write a description of class teki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teki extends Actor
{
    /**
     * Act - do whatever the teki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public teki(){
        int place = Greenfoot.getRandomNumber(3-0+1);
        setLocation(600, 40+45+(90*place));
    }
    
    public void act() 
    {
        // Add your action code here.
        setRotation(180); // set new angle
        move(10); // move from center along radius to circle
        setRotation(0); 
    }    
}
