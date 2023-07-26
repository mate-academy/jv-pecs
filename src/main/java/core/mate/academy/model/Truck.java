package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String color;
    private int year;

    public Truck() {
    }

    public Truck(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
