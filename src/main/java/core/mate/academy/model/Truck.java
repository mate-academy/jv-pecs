package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int towingCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int towingCapacity) {
        super(name, color);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
