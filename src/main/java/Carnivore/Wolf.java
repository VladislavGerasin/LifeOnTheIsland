package Carnivore;

import Animals.Carnivore;
import Simulation.Coordinate;

public class Wolf extends Carnivore {
    public Wolf(Coordinate coordinates) {
        super("Волк", "\uD83D\uDC3A", coordinates, 50, 30, 3, 8);
    }

    @Override
    protected Wolf createNewAnimal(Coordinate coordinates) {
        return new Wolf(coordinates);
    }
}
