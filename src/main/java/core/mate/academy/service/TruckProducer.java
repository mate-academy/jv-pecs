package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        return truckList;
    }
}
