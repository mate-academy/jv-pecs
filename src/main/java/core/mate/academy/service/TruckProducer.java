package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        var firstTruck = new Truck("First Truck", "Blue", 60000);
        var secondTruck = new Truck("Second Truck", "Silver", 120000);
        return List.of(firstTruck,secondTruck);
    }
}
