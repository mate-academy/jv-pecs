package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("Truck 1", "red"),
                new Truck("Truck 2", "green"),
                new Truck("Truck 3", "blue")
        );
    }
}
