package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks;

    public TruckProducer() {
        trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
