import greenfoot.*;

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends teki
{
    public Bomb()
    {
         GreenfootImage image = getImage();
         image.scale(image.getWidth() - 550, image.getHeight() - 550);
         setImage(image);
    }
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

}
