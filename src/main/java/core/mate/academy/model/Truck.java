package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int fuelCapacity;
    private int powerEngine;
    private int weight;

    public Truck() {
    }

    public Truck(int fuelCapacity, int powerEngine, int weight) {
        this.fuelCapacity = fuelCapacity;
        this.powerEngine = powerEngine;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
