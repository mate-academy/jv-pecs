package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = List.of(
                new Truck("Truck1", "Red", 2015),
                new Truck("Truck2", "Green", 2006),
                new Truck("Truck3", "Black", 2007)
        );
        return trucks;
    }
}
