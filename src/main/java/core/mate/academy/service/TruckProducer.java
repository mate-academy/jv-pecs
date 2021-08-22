package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck(10);
    private Truck truck2 = new Truck(20);
    private Truck truck3 = new Truck(30);

    @Override
    public List<Truck> get() {
        return List.of(truck1, truck2, truck3);
    }
}
