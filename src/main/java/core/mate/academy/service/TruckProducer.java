package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        return List.of(new Truck("Volvo", "White", 300, true),
                new Truck("Mercedes", "Black", 400, true),
                new Truck("Renault", "Red", 300, false));
    }
}
