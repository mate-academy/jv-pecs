package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private boolean isElectric;

    public Truck() {
    }

    public Truck(int maxSpeed, boolean isElectric) {
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
