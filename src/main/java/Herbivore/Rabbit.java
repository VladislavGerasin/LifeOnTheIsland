package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class Rabbit extends Herbivore {
    public Rabbit(Coordinate coordinates) {
        super("Кролик", "\uD83D\uDC30", coordinates, 2, 150, 2, 0.45);
    }

    protected Rabbit createNewAnimal(Coordinate coordinates) {
        return new Rabbit(coordinates);
    }
}