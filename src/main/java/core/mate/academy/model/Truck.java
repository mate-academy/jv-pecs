package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean isLongVehicles;

    public Truck() {
    }

    public boolean isLongVehicles() {
        return isLongVehicles;
    }

    public void setLongVehicles(boolean longVehicles) {
        isLongVehicles = longVehicles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
