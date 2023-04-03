package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(12654, 2.95));
        trucks.add(new Truck(14845, 3.12));
        trucks.add(new Truck(16000, 3.26));
        return trucks;
    }
}
