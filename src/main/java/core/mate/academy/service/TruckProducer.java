package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("Truck1", "black", 2021),
                new Truck("Truck2", "blue", 2020),
                new Truck("Truck3", "green", 2019));
    }
}
