package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int length;
    private int numberOfCylinders;

    public Truck() {
    }

    public Truck(int length, int numberOfCylinders, String name, String color) {
        this.length = length;
        this.numberOfCylinders = numberOfCylinders;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
