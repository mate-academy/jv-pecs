package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck(10, 10, 100);
        Truck secondTruck = new Truck(20, 12, 200);
        Truck thirdTruck = new Truck(40, 15, 400);
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
