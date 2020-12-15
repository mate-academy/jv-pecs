package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(2300));
        truckList.add(new Truck(2100));
        truckList.add(new Truck(3200));
        return truckList;
    }
}
