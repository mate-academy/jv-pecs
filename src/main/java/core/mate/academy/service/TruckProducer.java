package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("truck-K2", "green", 3),
                new Truck("truck-K5", "white", 1));
    }
}
