package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("BigTruck", "Orange", 40));
        trucks.add(new Truck("MiddleTruck", "Red", 25));
        trucks.add(new Truck("SmallTruck", "Pink", 5));
        return trucks;
    }
}
