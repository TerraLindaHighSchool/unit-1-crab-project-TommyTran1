import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,365,170);
        Worm worm = new Worm();
        addObject(worm,192,285);
        Worm worm2 = new Worm();
        addObject(worm2,264,336);
        Worm worm3 = new Worm();
        addObject(worm3,438,296);
        Worm worm4 = new Worm();
        addObject(worm4,147,128);
        Worm worm5 = new Worm();
        addObject(worm5,41,342);
        Worm worm6 = new Worm();
        addObject(worm6,252,411);
        Worm worm7 = new Worm();
        addObject(worm7,399,50);
        Worm worm8 = new Worm();
        addObject(worm8,160,31);
        Lobster lobster = new Lobster();
        addObject(lobster,400,375);
    }
}