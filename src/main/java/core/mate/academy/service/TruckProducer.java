package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(
                new Truck(900, 8),
                new Truck(500, 4),
                new Truck(650, 6)
                );
    }
}
