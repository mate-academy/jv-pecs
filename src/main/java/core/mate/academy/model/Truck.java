package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxPayloadCapacity;

    public Truck() {
    }

    public Truck(int maxPayloadCapacity, String name, String color) {
        this.maxPayloadCapacity = maxPayloadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
