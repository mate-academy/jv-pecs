package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("tanker", 112233, 20),
                       new Truck("tanker", 445566, 25),
                       new Truck("tanker", 778899, 50));
    }
}
