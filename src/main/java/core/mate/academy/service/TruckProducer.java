package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> machines = new ArrayList<>();
        machines.add(new Truck("Truck1", "Red"));
        machines.add(new Truck("Truck2", "Pink"));
        machines.add(new Truck("Truck3", "Olive"));
        return machines;
    }
}
