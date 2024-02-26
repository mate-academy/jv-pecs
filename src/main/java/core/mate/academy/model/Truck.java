package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int mileage;

    public Truck() {
    }

    public Truck(String name, String color, int mileage) {
        super(name, color);
        this.mileage = mileage;
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
