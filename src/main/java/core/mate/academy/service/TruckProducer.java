package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int INITIAL_SIZE = 5;
    private final List<Truck> trucks;

    public TruckProducer() {
        trucks = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        for (int i = 0; i < INITIAL_SIZE; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
