package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucksList;

    public TruckProducer(List<Truck> trucksList) {
        this.trucksList = trucksList;
    }

    @Override
    public List<Truck> get() {
        return trucksList;
    }
}
