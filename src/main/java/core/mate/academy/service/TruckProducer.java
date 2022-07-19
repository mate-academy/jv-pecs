package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("first", "black", 100));
        trucks.add(new Truck("second", "pink", 25));
        trucks.add(new Truck("last", "white", 90));
        return trucks;
    }
}
