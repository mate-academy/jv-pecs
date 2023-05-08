package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck smallTruck = new Truck(12, 15.5);
        Truck averageTruck = new Truck(16, 18.7);
        Truck bigTruck = new Truck(19, 22.3);
        return List.of(smallTruck, averageTruck, bigTruck);
    }
}
