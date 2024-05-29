package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        trucks.add(new Truck("Truck - 1", "Red", 200));
        trucks.add(new Truck("Truck - 2", "Green", 800));
        trucks.add(new Truck("Truck - 3", "Black", 500));

        return trucks;
    }
}
