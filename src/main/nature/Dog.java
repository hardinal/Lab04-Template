package nature;

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 * Clase de me perrito.
 */
public class Dog extends Canine implements Pet
{
    /**
     * Mas perritos!
     *
     * @param name nombre de perro
     */
    public Dog(String name)
    {
        super(name);
    }

    /**
     *  BARK BARK.
     */
    public void makeNoise()
    {
        System.out.println("bark...\n");
    }

    /**
     * Come mi perro.
     */
    public void eat()
    {
        this.hungerLevel -= 3;
        System.out.println("slop...\n");
    }

    /**
     * Play.
     */
    public void play()
    {
        System.out.println("runs...\n");
    }

    /**
     * Be friendly.
     */
    public void beFriendly()
    {
        System.out.println("nuzzles...\n");
    }


}
