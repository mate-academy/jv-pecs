package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Truck", "green", 1000);
        Truck truck2 = new Truck("Truck", "red", 1400);
        Truck truck3 = new Truck("Truck", "yellow", 1200);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
