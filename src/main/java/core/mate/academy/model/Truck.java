package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(final double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
