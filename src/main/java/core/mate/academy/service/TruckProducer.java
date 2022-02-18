package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> truckList = new ArrayList<>();

    @Override
    public List<Truck> get() {
        for (int i = 842; i < 849; i++) {
            truckList.add(new Truck(i));
        }
        return truckList;
    }
}
