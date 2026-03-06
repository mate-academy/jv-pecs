package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("first truck", "white", 70),
                new Truck("second truck", "grey", 88),
                new Truck("third truck", "pink", 65)
        );
    }
}
