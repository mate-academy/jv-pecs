package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(8,227,"Truck1","Purple"));
        truckList.add(new Truck(10,454,"Truck2","Orange"));
        return truckList;
    }
}
