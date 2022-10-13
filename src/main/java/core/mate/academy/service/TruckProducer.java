package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucksList = new ArrayList<>();
        trucksList.add(new Truck(100));
        trucksList.add(new Truck(140));
        trucksList.add(new Truck(310));
        return trucksList;
    }
}
