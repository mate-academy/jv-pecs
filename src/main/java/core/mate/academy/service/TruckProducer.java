package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck(4, 4.75, 2200, "Truck1", "Black"),
                new Truck(2, 3.4, 1500, "Truck2", "Red"),
                new Truck(4, 6.6, 1850, "Truck3", "Green"));
    }
}
