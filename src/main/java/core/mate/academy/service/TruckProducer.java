package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<Truck> implements MachineProducer<Truck> {
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
