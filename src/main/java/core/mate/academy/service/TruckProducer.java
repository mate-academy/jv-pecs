package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("tanker", 112233, 20);
        Truck truck2 = new Truck("tanker", 445566, 25);
        Truck truck3 = new Truck("tanker", 778899, 50);
        return List.of(truck1, truck2, truck3);
    }
}
