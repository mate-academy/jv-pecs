package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private final Truck truck1 = new Truck();
    private final Truck truck2 = new Truck();
    private final Truck truck3 = new Truck();

    private final List<Truck> trucks = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
