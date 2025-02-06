package nature;

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 * Clase para los lobos en los perros.
 */
public class Wolf extends Canine
{
    /**
     * Hace un nuevo lobo.
     *
     * @param name nombre de lobo
     */
    public Wolf(String name)
    {
        super(name);
    }


    /**
     * Hace ruido.
     */
    public void makeNoise()
    {
        System.out.println("growl...\n");

    }

    /**
     * Eat.
     */
    public void eat()
    {
        this.hungerLevel -= 2;
        System.out.println("rip with teeth...\n");

    }

}
