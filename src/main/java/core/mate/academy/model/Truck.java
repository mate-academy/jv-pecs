package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public Truck() {
    }

    public Truck(String color) {
        setName("Truck");
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
