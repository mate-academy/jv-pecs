package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(
                new Truck(4000, 0.9),
                new Truck(4300, 0.88),
                new Truck(5000, 0.8)
        );
    }
}
