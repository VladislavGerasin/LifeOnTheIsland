package Animals;
import Simulation.Coordinate;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, String icon, Coordinate coordinates, double weight, int maxNumberAnimals, double moveSpeed, double AmountOfFood) {
        super(name, icon, coordinates, weight, maxNumberAnimals, moveSpeed, AmountOfFood);
    }
}