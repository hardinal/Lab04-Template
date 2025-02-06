package nature;

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 * SPOOKY CAT CLASS.
 */
public class Ocelot extends Feline
{
    /**
     * NEW SPOOKY CAT.
     *
     * @param name SPOOKY CAT NAME
     */
    public Ocelot(String name)
    {
        super(name);
    }

    /**
     * SPOOKY CAT HONGRY.
     */
    public void eat()
    {
        System.out.println("pick...\n");
        this.hungerLevel -= 3;
    }
}
