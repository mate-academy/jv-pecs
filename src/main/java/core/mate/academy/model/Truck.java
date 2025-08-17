package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private String vehicleType;

    public Truck() {
    }

    public Truck(int loadCapacity, String vehicleType) {
        this.loadCapacity = loadCapacity;
        this.vehicleType = vehicleType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
