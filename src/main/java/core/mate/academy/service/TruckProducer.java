package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Truck1", "red", 100, 2015));
        truckList.add(new Truck("Truck2", "yellow", 150, 2017));
        truckList.add(new Truck("Truck3", "blue", 200, 2020));
        return truckList;
    }
}
