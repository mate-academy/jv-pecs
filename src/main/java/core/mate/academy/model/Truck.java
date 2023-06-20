package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String name;
    private String color;

    public Truck() {
    }

    public Truck(String name, String color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void doWork() {

    }
}
