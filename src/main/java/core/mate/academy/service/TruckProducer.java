package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = List.of(
                new Truck("truck1","black", 20),
                new Truck("truck2","blue", 30),
                new Truck("truck3","grey", 40));
        return trucks;
    }
}
