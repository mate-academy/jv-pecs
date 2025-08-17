package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("T1", "White", 4));
        trucks.add(new Truck("T2", "Orange", 6));
        trucks.add(new Truck("T3", "Dark", 8));
        return trucks;
    }
}
