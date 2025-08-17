package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("red", "truck1"));
        trucks.add(new Truck("green", "truck2"));
        trucks.add(new Truck("yellow", "truck3"));
        return trucks;
    }
}
