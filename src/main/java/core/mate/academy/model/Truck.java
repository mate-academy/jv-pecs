package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck() {
    }

    public Truck(double loadCapacity, int numberOfAxles) {
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
