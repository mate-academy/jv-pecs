package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean canTransportVehicles;
    private int capacity;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public boolean isCanTransportVehicles() {
        return canTransportVehicles;
    }

    public void setCanTransportVehicles(boolean canTransportVehicles) {
        this.canTransportVehicles = canTransportVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
