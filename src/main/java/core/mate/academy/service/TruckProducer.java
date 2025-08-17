package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("Axle configuration 1", 50, 100),
                new Truck("Axle configuration 2", 100, 150),
                new Truck("Axle configuration 3", 150, 200));
    }
}
