import greenfoot.*;

/**
 * This class defines a crab and controls the crab
 * @Author Tommy Tran
 * @Version 8/26/2021
 */
public class Crab extends Actor
{
    public void act()
    {
        move(0);
        turnAtEdge();
        checkKeyPress();
        onCollision();   
    }
    
    //turns the crab on the edge
    public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }

    // Checks for user key presses so users can turn the Crab private void
    //checkKeyPress()
    public void checkKeyPress()
    {
        
        
        if(Greenfoot.isKeyDown("right"))
        {
             setLocation(getX() + 3, getY());
            
        }

        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
        }
    }

    // Check for collisions with other subjects
    public void onCollision()
    {
        //Eating/removing worm code
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");

        }
        
        //win condition
         if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            
        //losing condition
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    //Gets the x coordinate of the actor (crab)
    
    
    
  
}

