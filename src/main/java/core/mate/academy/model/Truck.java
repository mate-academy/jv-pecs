package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
