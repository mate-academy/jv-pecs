package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(1000, 200));
        truckList.add(new Truck(10000, 2300));
        truckList.add(new Truck(2000, 1200));
        return truckList;
    }
}
