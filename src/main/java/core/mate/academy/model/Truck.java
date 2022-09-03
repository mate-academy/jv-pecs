package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int carryingCapacity;
    private boolean hasTrailer;

    public Truck(int carryingCapacity, boolean hasTrailer) {
        this.carryingCapacity = carryingCapacity;
        this.hasTrailer = hasTrailer;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
