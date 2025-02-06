package nature;
/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 *
 * The class Animal of Animals.
 */
public abstract class Animal
{
    /**
     * Super cool new protected fields.
     */
    protected String name;
    protected int hungerLevel;


    /**
     * Hecho un nuevo Animal.
     *
     * @param name the nombre
     */
    public Animal(String name)
    {
        this.name = name;
    }

    /**
     * Tienes hambe?
     *
     * @return si mucho hambre
     */
    public int getHungerLevel()
    {
        return this.hungerLevel;
    }

    /**
     * Como se llama?
     *
     * @return me llamo es
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * Tu eres hambre.
     *
     * @param hungerLevel mucho hambre
     */
    public void setHungerLevel(int hungerLevel)
    {
        if (hungerLevel < 0)
        {
            this.hungerLevel = 0;
        }
        else if (hungerLevel > 10)
        {
            this.hungerLevel = 10;
        }
        else
        {
            this.hungerLevel = hungerLevel;
        }
    }

    /**
     * TU NOMBRE ES!
     *
     * @param name el nombre
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * buenas noches.
     */
    public void sleep()
    {
        this.hungerLevel = 10;

        System.out.println("sleeping...\n");

    }

    /**
     * Caminando.
     */
    public void roam()
    {
        this.hungerLevel++;

        System.out.println("moving around...\n");
    }

    /**
     * Comer.
     */
    public abstract void eat();

    /**
     * Hace ruido.
     */
    public abstract void makeNoise();

}

