package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        return List.of(firstTruck, secondTruck);
    }
}
