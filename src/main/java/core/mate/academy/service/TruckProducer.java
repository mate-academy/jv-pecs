package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return createList();
    }

    private List<Truck> createList() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck());
        return truckList;
    }
}
