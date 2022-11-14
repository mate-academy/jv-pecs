package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Man", "white", 2010));
        truckList.add(new Truck("volvo", "red", 2001));
        truckList.add(new Truck("Honda", "black", 2013));
        return truckList;
    }
}
