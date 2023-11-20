package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private boolean hasBedInCabin;

    public Truck() {
    }

    public Truck(String engine, int maxSpeedKmH, boolean hasBedInCabin) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.hasBedInCabin = hasBedInCabin;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
