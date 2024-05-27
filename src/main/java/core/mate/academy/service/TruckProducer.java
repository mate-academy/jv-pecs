package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return Arrays.asList(
                new Truck("Truck1", "Red", 5000, 4),
                new Truck("Truck2", "Red", 7000, 6)
        );
    }
}
