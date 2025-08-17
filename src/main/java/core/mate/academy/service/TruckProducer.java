package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final double DEFAULT_LOAD_CAPACITY = 15d;
    private final List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(new Truck(DEFAULT_LOAD_CAPACITY));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
