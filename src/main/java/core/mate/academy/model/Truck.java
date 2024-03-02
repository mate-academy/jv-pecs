package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer<Machine> {
    public Truck() {
    }

    @Override
    public List<Machine> get() {
        List<Machine> truck = new ArrayList<>();
        truck.add(new Truck());
        return truck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
