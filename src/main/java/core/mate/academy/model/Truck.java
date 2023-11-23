package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double payloadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, double payloadCapacity) {
        setName(name);
        setColor(color);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
