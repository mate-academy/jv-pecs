package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(
                new Truck("First", "red", 20),
                new Truck("Second", "blue", 30),
                new Truck("Third", "yellow", 40)
        );
    }
}
