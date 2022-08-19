package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String name;
    private int power;

    public Truck() {
    }

    public Truck(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
