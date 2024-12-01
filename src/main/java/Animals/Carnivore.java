package Animals;
import Simulation.Coordinate;

public abstract class Carnivore extends Animal {
    public Carnivore(String name, String icon, Coordinate coordinates, double weight, int maxNumberAnimals, double moveSpeed, double AmountOfFood) {
        super(name, icon, coordinates, weight, maxNumberAnimals, moveSpeed, AmountOfFood);
    }
}
