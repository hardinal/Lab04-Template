package nature;

public abstract class Canine extends Animal
{
    public Canine(String name)
    {
        super(name);
    }

    public void roam()
    {
        this.hungerLevel++;
        System.out.println("canines like to roam in packs...\n");

    }

}
