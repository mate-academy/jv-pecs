package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck scania = new Truck("Scania", "Red");
        Truck daf = new Truck("Daf", "Blue");
        return List.of(scania, daf);
    }
}
