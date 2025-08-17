package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private String brandManufacturer;
    private TruckType truckType;

    public Truck(int loadCapacity, String brandManufacturer, TruckType truckType) {
        this.loadCapacity = loadCapacity;
        this.brandManufacturer = brandManufacturer;
        this.truckType = truckType;
    }

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getBrandManufacturer() {
        return brandManufacturer;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public enum TruckType {
        CAREER,
        URBAN,
        INTERCITY;
    }
}
