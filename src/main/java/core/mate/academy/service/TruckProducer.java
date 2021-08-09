package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Truck;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("green", 3),
                new Truck("white", 1));
    }
}
