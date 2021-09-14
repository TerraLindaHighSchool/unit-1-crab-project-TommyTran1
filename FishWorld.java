import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)
import java.lang.Math.*;

public class FishWorld extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("music.mp3");
   
    /**
     * Create the fish World (the ocean). Our world has a size 
     * of 1600,880 cells, where every cell is just 1 pixel.
     */
    public FishWorld() 
    {
        
        super(1000, 880, 1);
        backgroundMusic.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish();
        addObject(fish,((int)(Math.random()*1000)),((int)(Math.random()*880)));
        for(int i = 0 ; i < 20; i++) 
        {
            Microbe microbe = new Microbe();
            microbe.turn((int) (Math.random() * 360));
            addObject(microbe,((int)(Math.random()*1000)),((int)(Math.random()*880)));
        }

        for(int i = 0 ; i < 2; i++) 
        {
            Dolphin dolphin = new Dolphin();
            dolphin.turn((int) (Math.random() * 360));
            addObject(dolphin,((int)(Math.random()*1000)),((int)(Math.random()*880)));
        }
        for(int i = 0 ; i < 12; i++)
        {
            Bird bird = new Bird();
            bird.turn((int) (Math.random() * 360));
            addObject(bird,((int)(Math.random()*1000)),((int)(Math.random()*880)));
        }
    }
}