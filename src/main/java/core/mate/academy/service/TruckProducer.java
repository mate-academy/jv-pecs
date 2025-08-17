package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("VOV", "Red", 10, 10),
                new Truck("WWW", "Blue", 5, 5),
                new Truck("MERS", "White", 7, 7));
    }
}
