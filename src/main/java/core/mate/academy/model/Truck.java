package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private double fuelCapacity;

    public Truck() {
    }

    public Truck(int loadCapacity, double fuelCapacity) {
        this.loadCapacity = loadCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
