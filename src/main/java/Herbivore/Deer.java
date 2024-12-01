package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Deer extends Herbivore {
    public Deer(Coordinate coordinates) {
        super("Олень", "\uD83E\uDD8C", coordinates, 300, 20, 4, 50);
    }

    protected Deer createNewAnimal(Coordinate coordinates) {
        return new Deer(coordinates);
    }
}
