package nature;

public class HouseCat extends Feline
{
    public HouseCat(String name)
    {
        super(name);
    }

    public void eat()
    {
        System.out.println("crunch crunch...\n");
        this.hungerLevel -= 3;
    }

    public void play()
    {
        System.out.println("frolic...\n");
    }

    public void beFriendly()
    {
        System.out.println("purr...\n");
    }
}
