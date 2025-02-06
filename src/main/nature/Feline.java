package nature;

/**
 * sadfasdf. Checkstyle wanted something here.
 *  @author austin HARDIN
 *  @version V999999999
 *
 *
 * Un gato abstraco extiende animal.
 */
public abstract class Feline extends Animal
{
    /**
     * Hace nuevo gato.
     *
     * @param name the name
     */
    public Feline(String name)
    {
        super(name);
    }

    /**
     * Caminando.
     */
    public void roam()
    {
        this.hungerLevel++;
        System.out.println("felines like to roam alone...");

    }

    /**
     * Dormir y hace hambre.
     */
    public void sleep()
    {
        this.hungerLevel = 10;
        System.out.println("taking a cat nap...");
    }

    /**
     * Hace ruido gato malo.
     */
    public void makeNoise()
    {
        System.out.println("meow...");
    }
}
