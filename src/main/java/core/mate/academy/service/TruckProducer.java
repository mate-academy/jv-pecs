package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Truck 1", "yellow", "3.0");
        Truck secondTruck = new Truck("Truck 2", "red", "2.0");
        Truck thirdTruck = new Truck("Truck 3", "orange", "2.5");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
