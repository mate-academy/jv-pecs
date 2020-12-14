package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Mighty", "Green", 200));
        trucks.add(new Truck("Qwerty", "Orange", 400));
        trucks.add(new Truck("Enforcer", "Blue", 500));
        return trucks;
    }
}
