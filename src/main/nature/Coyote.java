package nature;

public class Coyote extends Canine
{
    public Coyote(String name)
    {
        super(name);
    }

    public void makeNoise()
    {
        System.out.println("howl...\n");
    }

    public void eat()
    {
        this.hungerLevel-= 2;
        System.out.println("gnaws...\n");

    }

}
