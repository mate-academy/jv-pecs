package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = List.of(
                new Truck("truck1 1", "orange", 2),
                new Truck("truck1 2", "white", 6));
        return trucks;
    }
}
