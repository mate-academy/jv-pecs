package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("carrier","Black"));
        truckList.add(new Truck("tractor","Green"));
        truckList.add(new Truck("van","Red"));
        return truckList;
    }
}
