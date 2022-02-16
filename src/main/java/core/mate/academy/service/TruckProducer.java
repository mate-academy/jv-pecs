package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> truckList = new ArrayList<>();

    @Override
    public List<Truck> get() {
        for (int i = 0; i < 5; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
