package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckSize;

    public Truck(String name, String color, int truckSize) {
        super(name, color);
        this.truckSize = truckSize;
    }

    public Truck() {
    }

    public int getTruckSize() {
        return truckSize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
