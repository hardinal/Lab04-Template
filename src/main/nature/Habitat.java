package nature;

import java.util.ArrayList;

public class Habitat
{
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> Animal;

    public Habitat(String name, double lat, double lon)
    {
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
        return Animal.size();
    }

    public void addAnimals(Animal animal)
    {

    }

    public void testAnimals()
    {

    }
}
