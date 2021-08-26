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
        move(3);
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
            turn(4);
        }

        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }

    // Check for collisions with other subjects
    public void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }

    }
}

