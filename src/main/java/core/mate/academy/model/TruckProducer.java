package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("Mighty", "Green", 200),
                new Truck("Qwerty", "Orange", 400),
                new Truck("Enforcer", "Blue", 500));
    }
}
