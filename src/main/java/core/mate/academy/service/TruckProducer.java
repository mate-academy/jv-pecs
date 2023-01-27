package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Axle configuration 1", 50, 100));
        trucks.add(new Truck("Axle configuration 2", 100, 150));
        trucks.add(new Truck("Axle configuration 3", 150, 200));
        return trucks;
    }
}
