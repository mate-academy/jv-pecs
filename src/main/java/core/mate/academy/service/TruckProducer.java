package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("T1", "red", 10, 10);
        Truck truck2 = new Truck("T1", "green", 20, 20);
        Truck truck3 = new Truck("T1", "blue", 30, 30);
        return List.of(truck1, truck2, truck3);
    }
}
