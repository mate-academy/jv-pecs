package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks = List.of(new Truck(), new Truck());

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
