import greenfoot.*;

public class Score extends Actor
{

    public void act() 
    {
        // Add your action code here.
        String score = "SCORE " + Game_page.getScore();
        getWorld().showText(score + "kg", 100, 10);

    }    
}
