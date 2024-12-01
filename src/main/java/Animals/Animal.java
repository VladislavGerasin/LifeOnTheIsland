package Animals;
import Simulation.Coordinate;

public abstract class Animal {
    private String name;
    private String icon;
    private Coordinate coordinates;
    private double weight;
    private int maxNumberAnimals;
    private double moveSpeed;
    private double AmountOfFood;

    // Конструктор
    public Animal(String name, String icon, Coordinate coordinates, double weight, int maxNumberAnimals, double moveSpeed, double AmountOfFood) {
        this.name = name;
        this.icon = icon;
        this.coordinates = coordinates;
        this.weight = weight;
        this.maxNumberAnimals = maxNumberAnimals;
        this.moveSpeed = moveSpeed;
        this.AmountOfFood = AmountOfFood;
    }

    // Абстрактный метод для создания нового экземпляра животного
    protected abstract Animal createNewAnimal(Coordinate coordinates);
}




