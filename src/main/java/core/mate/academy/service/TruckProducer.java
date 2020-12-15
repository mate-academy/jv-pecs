package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Truck 1", "Caramel", 100, "Body 1", "Engine 1");
        Truck truck2 = new Truck("Truck 2", "Brown", 200, "Body 2", "Engine 2");
        Truck truck3 = new Truck("Truck 3", "Green", 300, "Body 3", "Engine 3");

        return List.of(truck1, truck2, truck3);
    }
}
