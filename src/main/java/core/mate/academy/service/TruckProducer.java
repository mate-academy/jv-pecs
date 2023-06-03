package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private final Truck truck1 = new Truck("Truck1", "Yellow", 3_000);
    private final Truck truck2 = new Truck("Truck2", "Green", 5_000);
    private final Truck truck3 = new Truck("Truck3", "Grey", 7_500);
    private final List<Machine> trucks = List.of(truck1, truck2, truck3);
    
    @Override
    public List<Machine> get() {
        return trucks;
    }
}
