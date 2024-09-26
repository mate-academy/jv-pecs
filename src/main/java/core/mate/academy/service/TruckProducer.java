package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck threeWheelTruck = new Truck(3);
        Truck fourWheelTruck = new Truck(4);
        return List.of(threeWheelTruck, fourWheelTruck);
    }
}
