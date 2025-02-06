package nature;

public class Hippo extends Animal
{
    public Hippo(String name)
    {
        super(name);
    }

    public void makeNoise()
    {
        System.out.println("blub...\n");

    }

    public void eat()
    {
        this.hungerLevel-= 1;
        System.out.println("slurp...\n");

    }

}
