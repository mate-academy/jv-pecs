package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("truck1", "blue", "kind1", 5));
        trucks.add(new Truck("truck2", "green", "kind2", 2));
        return trucks;
    }
}
