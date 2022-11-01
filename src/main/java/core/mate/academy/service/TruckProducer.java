package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        final Truck truck1 = new Truck();
        final Truck truck2 = new Truck();
        final Truck truck3 = new Truck();
        return List.of(truck1, truck2, truck3);
    }
}
