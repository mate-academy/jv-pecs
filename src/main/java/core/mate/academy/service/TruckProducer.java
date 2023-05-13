package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("Truck", "blue", 30),
            new Truck("Truck", "silver", 25),
            new Truck("Truck", "white", 18)
        );
    }
}
