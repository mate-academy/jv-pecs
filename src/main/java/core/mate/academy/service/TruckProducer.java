package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("Truck_1", "Red", 45),
                new Truck("Truck_2", "Green", 50),
                new Truck("Truck_3", "White", 25)
        );
    }
}
