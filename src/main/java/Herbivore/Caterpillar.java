package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Caterpillar  extends Herbivore {
    public Caterpillar(Coordinate coordinates) {
        super("Гусеница", "\uD83D\uDC1B", coordinates, 0.01, 1000, 0, 0);
    }

    protected Caterpillar createNewAnimal(Coordinate coordinates) {
        return new Caterpillar(coordinates);
    }
}