package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
