import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Controls the lobster, lobster is an enemy
 * 
 * @Author Tommy Tran
 * @Version 8/30/2021
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
    }

    //Turns the Lobster at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }

}
