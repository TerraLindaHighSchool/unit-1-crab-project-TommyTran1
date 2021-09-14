import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math.*; // (Math)
/**
 * Controls the Worm and acts as a reference class for other Actors
 * 
 * @Author Tommy Tran
 * @Version 8/30/2021
 */
public class Microbe extends Actor
{
    int delay = 1000;
    /**
     * Act - do whatever the Microbe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move((int) ((Math.random() * 10)));
        turnAtEdge();
        replicate();
    }

    public void turnAtEdge()
    {
        if(isAtEdge()){
            turn((int) (10 + (Math.random() * 150)));
        }
    }

    public void replicate()
    {
        if (delay <= 0) 
        {
            if(isTouching(Microbe.class))
            {
                if(getWorld().getObjects(Microbe.class).size() <= 50)
                {
                    Microbe microbe2 = new Microbe();
                    getWorld().addObject(microbe2, getX(), getY());
                    delay = 1000;

                }
            }  
        }
        if (delay > 0)
        {
            delay--;

        }
    }
}