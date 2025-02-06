package nature;

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 * El Coyote en los perros.
 */
public class Coyote extends Canine
{
    /**
     * Hace nuevo Coyote.
     *
     * @param name el nombre
     */
    public Coyote(String name)
    {
        super(name);
    }

    /**
     * Hace ruido.
     */
    public void makeNoise()
    {
        System.out.println("howl...\n");
    }

    /**
     * Come coyote, come.
     */
    public void eat()
    {
        this.hungerLevel -= 2;
        System.out.println("gnaws...\n");

    }

}
