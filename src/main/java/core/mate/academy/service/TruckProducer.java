package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(new Truck(true));
        truckList.add(new Truck(false));
    }

    @Override
    public List get() {
        return truckList;
    }
}
