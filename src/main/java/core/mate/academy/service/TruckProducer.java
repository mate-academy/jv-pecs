package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new LinkedList<>();
        final int size = 3;
        for (int i = 0; i < size; i++) {
            trucks.add(new Truck(i));
        }

        return trucks;
    }
}
