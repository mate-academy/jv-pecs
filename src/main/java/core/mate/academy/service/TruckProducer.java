package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int DEFAULT_LIST_LENGTH = 5;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < DEFAULT_LIST_LENGTH; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
