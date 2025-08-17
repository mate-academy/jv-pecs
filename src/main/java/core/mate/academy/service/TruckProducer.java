package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("orange", "DAF", 90, true));
        trucks.add(new Truck("red", "MERCEDES", 120, false));
        return trucks;
    }
}
