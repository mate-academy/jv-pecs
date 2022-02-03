package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        Truck truck1 = new Truck("owner1", 1);
        Truck truck2 = new Truck("owner1", 2);
        Truck truck3 = new Truck("owner1", 3);
        return List.of(truck1, truck2, truck3);
    }
}
