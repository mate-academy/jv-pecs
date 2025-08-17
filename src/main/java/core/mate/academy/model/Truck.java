package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int length;
    private double carryingCapacity;

    public Truck() {
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public double carryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity() {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
