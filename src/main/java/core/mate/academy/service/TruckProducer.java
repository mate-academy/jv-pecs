package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("First truck", "Green", 2000));
        trucks.add(new Truck("Second truck", "Pink", 4000));
        trucks.add(new Truck("Third truck", "Blue", 8000));
        trucks.add(new Truck("Fourth truck", "White", 1000));
        return trucks;
    }
}
