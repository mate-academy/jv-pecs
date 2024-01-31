package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        Truck truck1 = new Truck("truck 1", "black", "on-board", "medium tonnage");
        Truck truck2 = new Truck("truck 2", "navy blue", "van", "small tonnage");
        Truck truck3 = new Truck("truck 3", "white", "tractor", "large tonnage");
        return List.of(truck1, truck2, truck3);
    }
}
