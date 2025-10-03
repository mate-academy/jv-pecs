package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Scania", "Red", 23000, 5, "Diesel"));
        trucks.add(new Truck("Renault", "Blue", 15000, 4, "Patrol"));
        return trucks;
    }
}
