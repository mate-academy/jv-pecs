package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String brand;
    private int wheelRadius;
    private String bodyType;

    public Truck(String brand, int wheelRadius, String bodyType) {
        this.brand = brand;
        this.wheelRadius = wheelRadius;
        this.bodyType = bodyType;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
