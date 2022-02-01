package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int SIZE_OF_LIST = 10;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
