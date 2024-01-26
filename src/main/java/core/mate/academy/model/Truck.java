package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoad;
    private int maxSpeed;

    public Truck() {
    }

    public Truck(int maxLoad, int maxSpeed) {
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
