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
        addObject(crab,372,228);
        Lobstering lobstering = new Lobstering();
        addObject(lobstering,120,115);
        worming worming = new worming();
        addObject(worming,422,375);
        worming.setLocation(423,372);
        worming worming2 = new worming();
        addObject(worming2,423,372);
        worming worming3 = new worming();
        addObject(worming3,225,396);
        worming worming4 = new worming();
        addObject(worming4,324,468);
        worming worming5 = new worming();
        addObject(worming5,100,477);
        worming worming6 = new worming();
        addObject(worming6,101,348);
        worming worming7 = new worming();
        addObject(worming7,206,296);
        worming worming8 = new worming();
        addObject(worming8,79,237);
        worming worming9 = new worming();
        addObject(worming9,240,169);
        worming worming10 = new worming();
        addObject(worming10,288,57);
        worming worming11 = new worming();
        addObject(worming11,499,50);
        worming worming12 = new worming();
        addObject(worming12,373,118);
        worming worming13 = new worming();
        addObject(worming13,483,175);
        worming worming14 = new worming();
        addObject(worming14,492,515);
        worming worming15 = new worming();
        addObject(worming15,332,326);
        worming worming16 = new worming();
        addObject(worming16,491,297);
    }
}