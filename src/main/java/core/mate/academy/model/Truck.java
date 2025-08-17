package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String driverName;
    private int mileage;

    public Truck() {
    }

    public Truck(String name, String color, String driverName, int mileage) {
        super(name, color);
        this.driverName = driverName;
        this.mileage = mileage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
