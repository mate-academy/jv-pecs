package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(12);
        Truck truck2 = new Truck(22);
        Truck truck3 = new Truck(32);
        List<Truck> trucks = List.of(truck1, truck2, truck3);
        return trucks;
    }
}
