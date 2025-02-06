package nature;

public abstract class Animal
{
    protected String name;
    protected int hungerLevel;


    public Animal(String name)
    {
        this.name = name;
    }

    public int getHungerLevel()
    {
        return this.hungerLevel;
    }

    public String getName()
    {
        return this.name;
    }


    public void setHungerLevel(int hungerLevel)
    {
        if (hungerLevel < 0 || hungerLevel > 10)
        {
            this.hungerLevel = 0;
        }
        else
        {
            this.hungerLevel = hungerLevel;
        }
    }

    public void setName(String name)
    {
         this.name = name;
    }

    public void sleep()
    {
        this.hungerLevel = 10;

        System.out.println("sleeping...\n");

    }

    public void roam()
    {
        this.hungerLevel++;

        System.out.println("moving around...\n");
    }

    public abstract void eat();

    public abstract void makeNoise();

}

