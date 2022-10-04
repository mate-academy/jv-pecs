package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck catTruck = new Truck(20, 30);
        Truck dafTruck = new Truck(12, 20);
        Truck volvoTruck = new Truck(13, 20);
        return List.of(catTruck, dafTruck, volvoTruck);
    }
}
