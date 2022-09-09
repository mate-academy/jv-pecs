package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Ocean", "Pink", 6, true));
        trucks.add(new Truck("Apple", "Green", 8, false));
        trucks.add(new Truck("Shark", "Brown", 4, true));
        return trucks;
    }
}
