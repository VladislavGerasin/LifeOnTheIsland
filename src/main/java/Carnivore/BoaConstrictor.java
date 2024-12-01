package Carnivore;

import Animals.Carnivore;
import Simulation.Coordinate;

public class BoaConstrictor extends Carnivore {
    public BoaConstrictor(Coordinate coordinates) {
        super("Удав", "\uD83D\uDC0D", coordinates, 15, 30, 1, 3);
    }

    @Override
    protected BoaConstrictor createNewAnimal(Coordinate coordinates) {
        return new BoaConstrictor(coordinates);
    }
}