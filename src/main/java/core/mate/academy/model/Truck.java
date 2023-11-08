package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer<Truck> {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        return List.of(new Truck(), new Truck());
    }
}
