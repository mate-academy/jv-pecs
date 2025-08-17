package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("truckOne", "green", 20));
        truckList.add(new Truck("truckTwo", "red", 3));
        truckList.add(new Truck("truckThree", "yellow", 10));
        return truckList;
    }
}
