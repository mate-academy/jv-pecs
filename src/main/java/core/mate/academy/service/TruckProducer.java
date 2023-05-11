package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1", "Grey", 120));
        trucks.add(new Truck("Truck2", "Black", 220));
        trucks.add(new Truck("Truck3", "Grey", 120));
        return trucks;
    }
}
