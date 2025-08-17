package core.mate.academy.model;

public class Truck extends Machine {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck(String name, String color,double loadCapacity, int numberOfAxles) {
        super(name, color);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public Truck setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
        return this;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Truck setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
