package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckType;
    private int loadCapacity;

    public Truck() {
    }

    public Truck(String truckType, int loadCapacity) {
        this.truckType = truckType;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
