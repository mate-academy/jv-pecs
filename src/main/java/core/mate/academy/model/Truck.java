package core.mate.academy.model;

import core.mate.academy.enums.TruckSize;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private TruckSize size;

    public Truck() {
    }

    public Truck(TruckSize size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
