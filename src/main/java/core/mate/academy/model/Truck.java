package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double maxLoad;
    private int maxSpeed;

    public Truck(double maxLoad, int maxSpeed, String name, String color) {
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
        super.setName(name);
        super.setColor(color);
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
