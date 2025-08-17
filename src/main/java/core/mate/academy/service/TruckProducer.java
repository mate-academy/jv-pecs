package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        return List.of(new Truck(8400, "track to build"),
                new Truck(12000, "truck to destroy walls"));
    }
}
