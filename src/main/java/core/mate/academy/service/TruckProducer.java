package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1", "Blue", 300));
        trucks.add(new Truck("Truck2", "Yellow", 250));
        trucks.add(new Truck("Truck3", "White", 200));
        return trucks;
    }
}
