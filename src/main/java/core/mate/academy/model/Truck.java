package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int capacity;
    private int length;

    public Truck() {
    }

    public Truck(String name, String color, int capacity, int length) {
        super(name, color);
        this.capacity = capacity;
        this.length = length;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
