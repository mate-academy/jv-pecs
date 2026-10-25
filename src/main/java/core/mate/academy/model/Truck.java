package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfAxles;
    private double maxCargoCapacity;

    public Truck() {
    }

    public Truck(int numberOfAxles, double maxCargoCapacity) {
        this.numberOfAxles = numberOfAxles;
        this.maxCargoCapacity = maxCargoCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Truck setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    public double getMaxCargoCapacity() {
        return maxCargoCapacity;
    }

    public Truck setMaxCargoCapacity(double maxCargoCapacity) {
        this.maxCargoCapacity = maxCargoCapacity;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
