package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private final Machine truck1 = new Truck();
    private final Machine truck2 = new Truck();
    private final List<Machine> trucksList = List.of(truck1, truck2);

    @Override
    public List<Machine> get() {
        return trucksList;
    }
}
