package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double maxCargoCapacity;

    public Truck() {
    }

    public double getMaxCargoCapacity() {
        return maxCargoCapacity;
    }

    public void setMaxCargoCapacity(double maxCargoCapacity) {
        this.maxCargoCapacity = maxCargoCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
