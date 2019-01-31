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
    int status = 0;
    int pw_up_time = 0;

    int keyPushed = 0;
    
    public Shark()
    {
            place = 1;
            GreenfootImage image = getImage();
            image.scale(250, 115);
            setImage(image);
           
    }

    public void act() 
    {
        
            if(place < 0){place = 0;}
            if(place > 3){place = 3;}
            
            setLocation(70, 40+45+(90*place));
            if(twait >= 0){twait--;}
            
            
            if( twait <= 0 && keyPushed == 0 && Greenfoot.isKeyDown( "up" ) ){
                place--;
                twait = 7;

                keyPushed = 1;

            }
            if( twait <= 0 && keyPushed == 0 && Greenfoot.isKeyDown( "down" ) ){
                place++;
                twait = 7;

                keyPushed = 1;
            }
            if( (Greenfoot.isKeyDown("up") == false) && (Greenfoot.isKeyDown("down") == false)){
                keyPushed = 0;

            }
            
            Actor hit_by_Nter = getOneObjectAtOffset( 0, 0, N_ter.class );
            if( hit_by_Nter != null ){
                Game_page.addScore();
                getWorld().removeObject(hit_by_Nter);
            }

            Actor hit_by_Ster = getOneObjectAtOffset( 0, 0, S_ter.class );
            if( hit_by_Ster != null  && status == 1){
                getWorld().removeObject( hit_by_Ster );
                Game_page.addScore2();
            }
            
            Actor hit_by_Pw = getOneObjectAtOffset( 0, 0, Pw.class );
            if( hit_by_Pw != null ){
                getWorld().removeObject( hit_by_Pw );
                change_Pw();
            }
            
            Actor hit_by_Ex = getOneObjectAtOffset( 0, 0, Ex.class);//サメに当たったらExが消える
            if(hit_by_Ex != null){
                getWorld().removeObject( hit_by_Ex ) ;
                Game_page.addLife();

                
                

            }
            
            Actor hit_by_Bomb = getOneObjectAtOffset( 0, 0, Bomb.class);//サメに当たったらExが消える
            if(hit_by_Bomb != null){
                getWorld().removeObject( hit_by_Bomb ) ;
                Game_page.subLife();

            }
            
            if(status == 1){ 
                pw_up_time--;
            }
            
            if(pw_up_time <= 0 && status == 1){
                change_Nm();
            }
                
    }
    
    public void change_Pw(){
            status = 1;

            pw_up_time = 500;

            pw_up_time = 180;

            setImage("shark_Pw.png"); 
            GreenfootImage image = getImage();
            image.scale(250, 115);
            setImage(image);
            
    }
    
    public void change_Nm(){
            status = 0;
            setImage("shark.png"); 
            GreenfootImage image = getImage();
            image.scale(250, 115);
            setImage(image);
    }
              

}
