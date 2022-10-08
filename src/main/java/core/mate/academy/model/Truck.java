package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int carryingCapasity;
    private int maxSpeed;

    public Truck() {
    }

    public Truck(int carryingCapasity, int maxSpeed) {
        this.carryingCapasity = carryingCapasity;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
