package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Buffalo extends Herbivore {
    public Buffalo(Coordinate coordinates) {
        super("Буйвол", "\uD83D\uDC02", coordinates, 700, 10, 3, 100);
    }

    protected Buffalo createNewAnimal(Coordinate coordinates) {
        return new Buffalo(coordinates);
    }
}