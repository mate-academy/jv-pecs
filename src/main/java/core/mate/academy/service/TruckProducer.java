package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
        return truckList;
    }
}
