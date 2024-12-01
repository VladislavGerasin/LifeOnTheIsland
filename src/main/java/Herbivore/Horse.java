package Herbivore;
import Animals.Herbivore;

import Simulation.Coordinate;

public class Horse extends Herbivore {
    public Horse(Coordinate coordinates) {
        super("Лошадь", "\uD83D\uDC34", coordinates, 400, 20, 4, 60);
    }

    protected Horse createNewAnimal(Coordinate coordinates) {
        return new Horse(coordinates);
    }
}

