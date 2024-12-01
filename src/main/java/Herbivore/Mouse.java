package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Mouse extends Herbivore {
    public Mouse(Coordinate coordinates) {
        super("Мышка", "\uD83D\uDC2D", coordinates, 0.05, 500, 1, 0.01);
    }

    protected Mouse createNewAnimal(Coordinate coordinates) {
        return new Mouse(coordinates);
    }
}