package nature;

public class Dog extends Canine
{
    public Dog(String name)
    {
        super(name);
    }

    public void makeNoise()
    {
        System.out.println("bark...\n");
    }

    public void eat()
    {
        this.hungerLevel-= 3;
        System.out.println("slop...\n");
    }

    public void play()
    {
        System.out.println("runs...\n");
    }

    public void beFriendly()
    {
        System.out.println("nuzzles...\n");
    }


}
