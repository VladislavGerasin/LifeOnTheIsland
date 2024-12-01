package Carnivore;

import Animals.Carnivore;
import Simulation.Coordinate;

public class Bear  extends Carnivore {
    public Bear (Coordinate coordinates) {
        super("Медведь", "\uD83D\uDC3B", coordinates, 500, 5, 2, 80);
    }

    @Override
    protected Bear  createNewAnimal(Coordinate coordinates) {
        return new Bear (coordinates);
    }
}