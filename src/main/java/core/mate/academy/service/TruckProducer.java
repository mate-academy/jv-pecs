package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_QUANTITY = 10;

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < MAX_QUANTITY; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
