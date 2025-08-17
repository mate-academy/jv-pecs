package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        Truck truck1 = new Truck(true, "Truck1", "Yellow");
        Truck truck2 = new Truck(true, "Truck2", "Yellow");
        truckList.add(truck1);
        truckList.add(truck2);
        return truckList;
    }
}
