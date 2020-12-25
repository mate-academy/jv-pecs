package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("truck", "blue", "trailerName"),
                new Truck("truck2", "yellow", "trailerName2"),
                new Truck()
        );
    }
}
