package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int LIST_SIZE = 3;

    @Override
    public List<? extends Truck> get() {
        List<Truck> trucks = new LinkedList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
