package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxCapacity;
    private int maxSpeed;

    public Truck() {
    }

    public Truck(String name, String color, int maxCapacity, int maxSpeed) {
        setName(name);
        setColor(color);
        this.maxCapacity = maxCapacity;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
