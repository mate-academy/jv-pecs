package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private static final String DEFAULT_MODEL = "MAN";
    private static final int DEFAULT_LOAD_CAPACITY = 15;
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < MACHINES_QUANTITY; i++) {
            trucks.add(new Truck(DEFAULT_MODEL, DEFAULT_LOAD_CAPACITY));
        }
        return trucks;
    }
}
