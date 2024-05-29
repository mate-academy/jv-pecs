package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxCargoCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int maxCargoCapacity) {
        super(name, color);
        this.maxCargoCapacity = maxCargoCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
