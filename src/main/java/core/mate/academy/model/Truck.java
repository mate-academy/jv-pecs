package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    boolean isLongVehicles;

    public Truck() {
        Random rand = new Random();
        isLongVehicles = rand.nextBoolean();
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
