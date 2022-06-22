package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Man", "white", 5, 100));
        trucks.add(new Truck("Volvo", "silver", 10, 200));
        return trucks;
    }
}
