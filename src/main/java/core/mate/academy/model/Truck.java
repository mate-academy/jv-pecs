package core.mate.academy.model;

import core.mate.academy.service.MachineService;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String modelWheels;
    private boolean hasBumper;

    public Truck() {
    }

    public Truck(String modelWheels, boolean hasBumper) {
        this.modelWheels = modelWheels;
        this.hasBumper = hasBumper;
    }

    @Override
    public void doWork() {
    }
}
