package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {
    private String kind;
    private int age;

    public Truck(String name, String color, String kind, int age) {
        super(name, color);
        this.kind = kind;
        this.age = age;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
