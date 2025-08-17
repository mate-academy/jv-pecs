package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            truckList.add(i, new Truck());
        }
        return truckList;
    }
}
