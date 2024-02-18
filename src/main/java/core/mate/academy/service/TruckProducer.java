package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final List<Truck> TRUCK_LIST = new ArrayList<>();

    @Override
    public List<Truck> get() {
        var firstTruck = new Truck("First Truck", "Blue", 60000);
        var secondTruck = new Truck("Second Truck", "Silver", 120000);
        TRUCK_LIST.add(firstTruck);
        TRUCK_LIST.add(secondTruck);
        return TRUCK_LIST;
    }
}
