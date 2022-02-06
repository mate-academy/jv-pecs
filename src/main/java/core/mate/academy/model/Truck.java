package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerCapacity;
    private int fuelTank;
    private String brandTrack;

    public Truck() {
    }

    public Truck(int fuelTank, String brandTrack, int trailerCapacity) {
        this.fuelTank = fuelTank;
        this.brandTrack = brandTrack;
        this.trailerCapacity = trailerCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
