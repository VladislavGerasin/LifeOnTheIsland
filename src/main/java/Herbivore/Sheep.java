package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Sheep extends Herbivore {
    public Sheep(Coordinate coordinates) {
        super("Овца", "\uD83D\uDC11", coordinates, 70, 140, 3, 15);
    }

    protected Sheep createNewAnimal(Coordinate coordinates) {
        return new Sheep(coordinates);
    }
}