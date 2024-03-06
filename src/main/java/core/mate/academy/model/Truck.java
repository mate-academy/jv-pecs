package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double speed;

    public Truck() {
    }

    public Truck(double speed) {
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
