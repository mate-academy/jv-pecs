package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private String truckType;

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
