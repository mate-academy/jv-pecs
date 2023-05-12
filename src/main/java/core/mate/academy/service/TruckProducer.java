package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("Truck", "black", "XD23", "Private working"),
                new Truck("Truck", "white", "XD233", "Private working"));
    }
}
