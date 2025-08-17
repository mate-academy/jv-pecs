package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("scania", "white", "tipper", 42.2);
        Truck truck2 = new Truck("volvo", "black", "mixer", 37.2);
        return List.of(truck1, truck2);
    }
}
