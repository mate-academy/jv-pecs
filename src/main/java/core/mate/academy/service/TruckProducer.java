package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Truck;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return truckList;
    }

    private Truck catTruck = new Truck(20, 30);
    private Truck dafTruck = new Truck(12, 20);
    private Truck volvoTruck = new Truck(13, 20);
    List<Truck> truckList = List.of(catTruck, dafTruck, volvoTruck);

}
