package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProdecer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(1, 1);
        Truck truck2 = new Truck(2, 2);
        Truck truck3 = new Truck(3, 3);

        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
        return truckList;
    }
}
