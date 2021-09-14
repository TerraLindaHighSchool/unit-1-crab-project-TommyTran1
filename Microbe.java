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
        int delay = 100;
        delay--;
        if (delay <= 50) {
            {
                if(isTouching(Microbe.class) == true)
                {
                    if(getWorld().numberOfObjects() == 50); 
                    {
                        Microbe microbe2 = new Microbe();
                        getWorld().addObject(microbe2, getX(), getY());

                    }
                }  

            }
        }

    }
}