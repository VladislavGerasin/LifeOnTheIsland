package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Duck extends Herbivore {
    public Duck(Coordinate coordinates) {
        super("Утка", "\uD83E\uDD86", coordinates, 1, 200, 4, 0.15);
    }

    protected Duck createNewAnimal(Coordinate coordinates) {
        return new Duck(coordinates);
    }
}