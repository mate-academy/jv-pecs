package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double maxLoadCapacity;

    public Truck(double maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
