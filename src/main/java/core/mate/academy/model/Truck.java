package core.mate.academy.model;

import core.mate.academy.service.MachineService;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineService {
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

    @Override
    public List getAll(Class type) {
        return null;
    }

    @Override
    public void fill(List machines, Machine value) {

    }

    @Override
    public void startWorking(List list) {

    }
}
