package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double cargoCapacity;
    private boolean hasTrailer;
    private String bodyType;

    public Truck() {
    }

    public Truck(double cargoCapacity, boolean hasTrailer, String bodyType) {
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer = hasTrailer;
        this.bodyType = bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
