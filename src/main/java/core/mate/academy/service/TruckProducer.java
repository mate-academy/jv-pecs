package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(1000));
        truckList.add(new Truck(1050));
        truckList.add(new Truck(55500));
        return truckList;
    }
}
