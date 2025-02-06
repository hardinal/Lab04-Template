package nature;

import java.util.ArrayList;

public class Habitat
{
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> animals;

    public Habitat(String name, double lat, double lon)
    {
        this.animals = new ArrayList<Animal>();
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;

    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String getName()
    {
        return name;
    }

    public void setLatitude(double lat)
    {
        this.latitude = lat;
    }

    public void setLongitude(double lon)
    {
        this.longitude = lon;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumOfAnimals()
    {
        return animals.size();
    }

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public void testAnimals()
    {
        System.out.println(this.name + "\n");
        System.out.println(this.latitude+ "\n");
        System.out.println(this.longitude+ "\n");
        System.out.println(this.getNumOfAnimals()+ "\n");

        for (Animal animal : animals)
        {
            animal.sleep();
            animal.makeNoise();
            animal.eat();
            animal.roam();

            if (animal instanceof Pet)
            {
                Pet pet = (Pet) animal;
                pet.play();
                pet.beFriendly();
            }
        }
    }
}
