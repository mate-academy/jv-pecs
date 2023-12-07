package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer<Truck> {
    public Truck() {
    }

    public Truck(String serialNumber, int power) {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Five", 5));
        trucks.add(new Truck("Six", 6));
        return trucks;
    }
}
