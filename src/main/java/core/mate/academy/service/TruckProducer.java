package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(10, "One"));
        trucks.add(new Truck(15, "Two"));
        trucks.add(new Truck(20, "Three"));
        return trucks;
    }
}
