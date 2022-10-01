package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("truck1", "blue", 1);
        Truck truck2 = new Truck("truck2", "yellow", 2);
        Truck truck3 = new Truck("truck3", "red", 3);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
