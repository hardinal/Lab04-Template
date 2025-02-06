package nature;

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 * Una clase para los perros.
 */
public abstract class Canine extends Animal
{
    /**
     * Hace un nuevo perro, buen perro.
     *
     * @param name el nombre de perro
     */
    public Canine(String name)
    {
        super(name);
    }

    /**
     * Caminando.
     */
    public void roam()
    {
        this.hungerLevel++;
        System.out.println("like canines roam in packs...\n");

    }

}
