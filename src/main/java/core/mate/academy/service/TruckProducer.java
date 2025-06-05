package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(2,4,"Truck1","purple"));
        truckList.add(new Truck(3,5,"Truck2","green"));
        return truckList;
    }
}
