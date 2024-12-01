package Herbivore;

import Animals.Herbivore;
import Simulation.Coordinate;

public class WildBoar extends Herbivore {
    public WildBoar(Coordinate coordinates) {
        super("Кабан", "\uD83D\uDC17", coordinates, 400, 50, 2, 50);
    }

    protected WildBoar createNewAnimal(Coordinate coordinates) {
        return new WildBoar(coordinates);
    }
}