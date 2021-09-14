import greenfoot.*;

/**
 * This class defines a crab and controls the crab

 * 
 * @Author Tommy Tran
 * @Version 8/30/2021
 */
public class Fish extends Actor
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

    // Checks for user key presses so users can move the Crab private void
    //checkKeyPress()
    public void checkKeyPress()
    {
        //moves the crab right by an int of 3
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());

        }

        //moves the crab left by an int of 3
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
        }

        //moves the crab up by an int of 3
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
        }

        //moves the crab down by an int of 3
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
        }
    }

    // Check for collisions with other subjects
    public void onCollision()
    {
        int score = 0;
        score++;
        if(getWorld().getObjects(Microbe.class).size() == 0)
        {
            System.out.print(score);
        }
        //Eating/removing worm code
        if(isTouching(Microbe.class))
        {
            removeTouching(Microbe.class);
            Greenfoot.playSound("slurp.wav");
        }

        //win condition
        if(getWorld().getObjects(Microbe.class).size() == 0)
        {
            Greenfoot.setWorld(new WinSplash());
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }

        //losing condition
        if(isTouching(Bird.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }

}
