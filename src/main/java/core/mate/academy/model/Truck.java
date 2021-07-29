package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements Workable {
    private double containerCapacity;
    private int wheelQuantity;

    public Truck() {
    }

    public Truck(double containerCapacity, int wheelQuantity) {
        this.containerCapacity = containerCapacity;
        this.wheelQuantity = wheelQuantity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
