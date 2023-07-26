package core.mate.academy.service.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return Arrays.asList(
                new Truck("Truck1", "Red", 5),
                new Truck("Truck2", "Red", 15));
    }
}
