package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double carryingCapacity;
    private boolean hasRefrigerator;

    public Truck() {
    }

    public Truck(double carryingCapacity, boolean hasRefrigerator) {
        this.carryingCapacity = carryingCapacity;
        this.hasRefrigerator = hasRefrigerator;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
