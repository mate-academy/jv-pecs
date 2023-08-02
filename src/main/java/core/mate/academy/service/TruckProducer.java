package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck 1", "Blue", 5000));
        trucks.add(new Truck("Truck 2", "White", 6000));
        trucks.add(new Truck("Truck 3", "Red", 4500));
        return trucks;
    }
}
