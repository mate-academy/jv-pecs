package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1", "Black", 2_000_000, 100_000));
        trucks.add(new Truck("Truck2", "White", 1_500_000, 120_000));
        return trucks;
    }
}
