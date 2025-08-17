package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUM_TRUCKS = 2;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < NUM_TRUCKS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
