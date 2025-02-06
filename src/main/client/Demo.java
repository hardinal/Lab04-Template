package client;

import nature.Habitat;
import nature.*;
// its really giving me an error for this.
// Im not typing an import for everything.

/**
 * sadfasdf. Checkstyle wanted something here.
 * @author austin HARDIN i didnt write all of this.
 * @version V999999999
 * Demo used to manually test the program.
 *
 */

public class Demo
{
    /**
     * Runs the demo.
     *
     * @param args command line arguments
     */
    public static void main(String[] args)
    {

        Habitat boogieBarn = new Habitat("Boogie Barn", 0, 0);
        boogieBarn.addAnimal(new Hippo("Big Chunk"));
        boogieBarn.addAnimal(new Lion("Big Mane"));
        boogieBarn.addAnimal(new SiameseCat("Stray"));
        boogieBarn.addAnimal(new HouseCat("Outdoor cat"));
        boogieBarn.addAnimal(new Ocelot("Big Kitty"));
        boogieBarn.addAnimal(new Coyote("Wiley"));
        boogieBarn.addAnimal(new Dog("Best Boy"));
        boogieBarn.addAnimal(new Wolf("Wolf Fang"));
        // Test animals in the habitat
        boogieBarn.testAnimals();

    }
}
