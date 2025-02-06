package nature;

public abstract class Feline extends Animal
{
    public Feline(String name)
    {
        super(name);
    }

    public void roam()
    {
        this.hungerLevel++;
        System.out.println("felines like to roam alone...");

    }

    public void sleep()
    {
        this.hungerLevel = 10;
        System.out.println("taking a cat nap...");
    }

    public void makeNoise()
    {
        System.out.println("meow...");
    }
}
