package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Truck> truckList = new ArrayList<>();

    public TruckProducer() {
        truckList.add(new Truck());
    }

    @Override
    public List get() {
        return truckList;
    }
}
