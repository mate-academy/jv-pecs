package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck first = new Truck(10000);
        Truck second = new Truck(7900);
        trucks.add(first);
        trucks.add(second);
        return trucks;
    }
}
