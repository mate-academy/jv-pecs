package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("MAN", 25.5, 3, "Diesel"),
                new Truck("Scania", 30.0, 4, "Diesel")
        );
    }
}
