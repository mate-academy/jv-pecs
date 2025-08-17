package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(14098, "Brown", "Worker7"));
        trucks.add(new Truck(12758, "White", "Worker8"));
        trucks.add(new Truck(10368, "Yellow", "Worker9"));
        return trucks;
    }
}
