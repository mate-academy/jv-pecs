package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(10);
        Truck truck2 = new Truck(20);
        Truck truck3 = new Truck(30);
        return List.of(truck1, truck2, truck3);
    }
}
