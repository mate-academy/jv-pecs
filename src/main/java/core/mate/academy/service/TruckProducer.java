package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;
import java.util.Map;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(234, 34);
        Truck truck2 = new Truck(256, 40);
        Truck truck3 = new Truck(546, 10);
        return List.of(truck1, truck2, truck3);
    }
}
