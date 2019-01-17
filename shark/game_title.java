import greenfoot.*;

/**
 * Write a description of class game_title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_title extends Actor
{
    GifImage myGif = new GifImage("title.gif");
    /**
     * Act - do whatever the game_title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage( myGif.getCurrentImage() );
        getImage().scale(600,200);
    }    
}
