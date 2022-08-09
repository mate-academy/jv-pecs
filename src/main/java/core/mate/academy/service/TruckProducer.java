package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(new Truck("First truck", "Red"));
        truckList.add(new Truck("Second truck", "Blue"));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
