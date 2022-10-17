package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = List.of(new Truck("truck1", "black", 12),
                new Truck("truck2", "white", 22),
                new Truck("truck3", "grey", 32));
        return trucks;
    }
}
