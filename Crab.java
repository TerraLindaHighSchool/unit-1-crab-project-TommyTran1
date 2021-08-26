import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
         move(-50);
         turnAtEdge();
         checkKeyPress();
         onCollision();   
    }
    
    public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
    public void checkKeyPress()
    {
        
    }
    
    public void onCollision()
    {
        
    }
}


