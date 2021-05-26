package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int maxWeigth;

    public Truck(int maxSpeed, int maxWeigth) {
        this.maxSpeed = maxSpeed;
        this.maxWeigth = maxWeigth;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
