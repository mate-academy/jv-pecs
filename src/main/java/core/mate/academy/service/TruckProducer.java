package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    private final Truck catTruck = new Truck(20, 30);
    private final Truck dafTruck = new Truck(12, 20);
    private final Truck volvoTruck = new Truck(13, 20);
    private final List<Truck> truckList = List.of(catTruck, dafTruck, volvoTruck);

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
