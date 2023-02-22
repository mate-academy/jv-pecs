package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < PRODUCTION_AMOUNT; i++) {
            truckList.add(new Truck(20, 120));
        }
        return truckList;
    }
}
