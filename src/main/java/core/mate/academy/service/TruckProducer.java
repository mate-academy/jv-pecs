package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("DAF", 450);
        Truck secondTruck = new Truck("Renault", 550);
        return List.of(firstTruck, secondTruck);
    }
}
