import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        onCollision();
        turnAtEdge();
    }

    public void onCollision() 
    {
        if(isTouching(Bird.class))
        {
            removeTouching(Bird.class);
            Greenfoot.playSound("slurp.wav");
        }
    }

    public void turnAtEdge()
    {
        if(isAtEdge()) 
        {
            turn((int) (10 + (Math.random() * 150)));   
        }
    }

}