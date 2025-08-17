package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck 1", "Black", 14000));
        trucks.add(new Truck("Truck 2", "White", 14500));
        return trucks;
    }
}
