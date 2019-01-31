import greenfoot.*;

public class title extends Actor
{
    GifImage myGif = new GifImage("title.gif");

    public void act() 
    {
        // Add your action code here.
        setImage( myGif.getCurrentImage() );
        getImage().scale(600,200);
    }  
}
