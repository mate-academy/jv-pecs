package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int length;
    private int power;

    public Truck() {
    }

    public Truck(String name, String color, int length, int power) {
        super(name, color);
        this.length = length;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
