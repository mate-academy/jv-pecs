package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("LTZ", "blue", 5, "D-144"));
        trucks.add(new Truck("MTZ", "yellow", 2, "D-243"));
        trucks.add(new Truck("VT", "read", 3, "D-461"));
        return trucks;
    }
}
