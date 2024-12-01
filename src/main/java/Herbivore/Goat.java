package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Goat extends Herbivore {
    public Goat(Coordinate coordinates) {
        super("Коза", "\uD83D\uDC10", coordinates, 60, 140, 3, 10);
    }

    protected Goat createNewAnimal(Coordinate coordinates) {
        return new Goat(coordinates);
    }
}