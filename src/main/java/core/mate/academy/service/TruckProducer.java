package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("truck1", "green", 2);
        Truck truck2 = new Truck("truck2", "grey", 3);
        Truck truck3 = new Truck("truck3", "violet", 4);
        return List.of(truck1, truck2, truck3);
    }
}
