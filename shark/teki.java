import greenfoot.*;

public class teki extends Actor
{
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
