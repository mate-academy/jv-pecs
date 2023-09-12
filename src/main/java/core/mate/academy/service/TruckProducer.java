package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("truck1", "red", 300));
        trucks.add(new Truck("truck2", "blue", 250));
        trucks.add(new Truck("truck3", "green", 400));
        return trucks;
    }
}
