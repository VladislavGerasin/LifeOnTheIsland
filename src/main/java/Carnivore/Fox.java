package Carnivore;

import Animals.Carnivore;
import Simulation.Coordinate;

public class Fox  extends Carnivore {
    public Fox(Coordinate coordinates) {
        super("Лиса", "\uD83E\uDD8A", coordinates, 8, 30, 2, 2);
    }

    @Override
    protected Fox createNewAnimal(Coordinate coordinates) {
        return new Fox(coordinates);
    }
}