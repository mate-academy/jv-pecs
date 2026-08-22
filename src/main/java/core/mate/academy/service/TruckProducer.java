package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1","green", 340));
        trucks.add(new Truck("Truck2","orange", 125));
        trucks.add(new Truck("Truck3","purple",270));
        return trucks;
    }
}
