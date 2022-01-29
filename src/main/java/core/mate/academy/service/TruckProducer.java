package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Ukraine", 6);
        Truck truck2 = new Truck("France", 8);
        Truck truck3 = new Truck("USA", 10);
        return List.of(truck1, truck2, truck3);
    }
}
