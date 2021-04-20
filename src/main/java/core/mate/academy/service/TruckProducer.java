package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("Volvo", "white", 10),
                new Truck("Man", "Orange", 15),
                new Truck("Man", "Red", 20));
    }
}
