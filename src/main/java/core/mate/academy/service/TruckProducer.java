package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("MAN", "red", 300.0),
                new Truck("Scania", "blue", 750.0),
                new Truck("Iveco", "yellow", 270.0)
        );
    }
}
