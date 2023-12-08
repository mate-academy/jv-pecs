package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck firstTruck = new Truck("Truck 1", "yellow", "3.0");
    private final Truck secondTruck = new Truck("Truck 2", "red", "2.0");
    private final Truck thirdTruck = new Truck("Truck 3", "orange", "2.5");

    @Override
    public List<Truck> get() {
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
