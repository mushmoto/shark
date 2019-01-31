import greenfoot.*;

public class Bomb extends teki
{
    public Bomb()
    {
         GreenfootImage image = getImage();
         image.scale(image.getWidth() - 550, image.getHeight() - 550);
         setImage(image);
    }
}
