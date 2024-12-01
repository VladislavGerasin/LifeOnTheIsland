package Carnivore;

import Animals.Carnivore;
import Simulation.Coordinate;


public class Eagle  extends Carnivore {
    public Eagle (Coordinate coordinates) {
        super("Орел", "\uD83E\uDD85", coordinates, 6, 20, 3, 1);
    }

    @Override
    protected Eagle  createNewAnimal(Coordinate coordinates) {
        return new Eagle (coordinates);
    }
}