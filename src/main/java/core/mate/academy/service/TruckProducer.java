package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("truck", "red", 12000),
                new Truck("truck2", "white", 10000),
                new Truck("truck1", "blue", 15000));
    }
}
