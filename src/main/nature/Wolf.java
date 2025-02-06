package nature;

public class Wolf extends Canine
{
    public Wolf(String name)
    {
        super(name);
    }


    public void makeNoise()
    {
        System.out.println("growl...\n");

    }

    public void eat()
    {
        this.hungerLevel-= 2;
        System.out.println("rip with teeth...\n");

    }

}
