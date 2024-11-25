package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("BBB", "blue", 10.5));
        trucks.add(new Truck("a&c", "yellow", 10.5));
        trucks.add(new Truck("Frank", "blue", 16.0));
        return trucks;
    }
}
