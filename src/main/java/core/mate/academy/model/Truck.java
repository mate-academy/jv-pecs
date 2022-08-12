package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int paramTruck1;
    private String paramTrack2;

    public Truck() {
    }

    public Truck(String color, String name, int paramTruck1, String paramTrack2) {
        super(color, name);
        this.paramTruck1 = paramTruck1;
        this.paramTrack2 = paramTrack2;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
