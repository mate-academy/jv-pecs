package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double cabinCapacity;

    public Truck() {
    }

    public void setCabinCapacity(double cabinCapacity) {
        this.cabinCapacity = cabinCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
