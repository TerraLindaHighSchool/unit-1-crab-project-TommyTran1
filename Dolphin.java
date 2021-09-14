import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author Tommy Tran
 * @version 9/14
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

    //Handles any collision with objects the Dolphin might have.
    public void onCollision() 
    {
        if(isTouching(Bird.class))
        {
            removeTouching(Bird.class);
            Greenfoot.playSound("eat.mp3");
        }
    }

    //handles when and how the Dolphin interacts with edge
    public void turnAtEdge()
    {
        if(isAtEdge()) 
        {
            turn((int) (10 + (Math.random() * 150)));   
        }
    }

}