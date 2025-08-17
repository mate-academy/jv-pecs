package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck(100, 101, 111);
        Truck secondTruck = new Truck(200, 202, 222);
        Truck thirdTruck = new Truck(300, 303, 333);
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
