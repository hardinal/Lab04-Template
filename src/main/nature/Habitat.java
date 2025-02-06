package nature;

import java.util.ArrayList;

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN
 * @version V999999999
 * Un clase de Habitat.
 */
public class Habitat
{
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> animals;

    /**
     * Hace nuevo Habitat.
     *
     * @param name nombre
     * @param lat  latitude
     * @param lon  the longitude
     */
    public Habitat(String name, double lat, double lon)
    {
        this.animals = new ArrayList<Animal>();
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;

    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public double getLatitude()
    {
        return latitude;
    }

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public double getLongitude()
    {
        return longitude;
    }

    /**
     * Da me nombre.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets latitude.
     *
     * @param lat the lat
     */
    public void setLatitude(double lat)
    {
        this.latitude = lat;
    }

    /**
     * Sets longitude.
     *
     * @param lon the lon
     */
    public void setLongitude(double lon)
    {
        this.longitude = lon;
    }

    /**
     * Hace nombre.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Da me cuantos animals.
     *
     * @return the num of animals
     */
    public int getNumOfAnimals()
    {
        return animals.size();
    }

    /**
     * Uno mas animal.
     *
     * @param animal the animal
     */
    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    /**
     * Pruebra animals.
     */
    public void testAnimals()
    {
        System.out.print(this.name + "\n");
        System.out.print(this.latitude + "\n");
        System.out.print(this.longitude + "\n");
        System.out.print(this.getNumOfAnimals() + "\n");

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
