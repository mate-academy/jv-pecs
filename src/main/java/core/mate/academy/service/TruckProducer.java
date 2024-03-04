package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(9000, "Truck-1", "White"));
        trucks.add(new Truck(8000, "Truck-2", "Red"));
        trucks.add(new Truck(7000, "Truck-3", "Blue"));
        return trucks;
    }
}
