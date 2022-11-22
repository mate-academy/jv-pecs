package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer {
    private static final int MAX_COUNT = 10;
    private int randomSize = new Random().nextInt(MAX_COUNT);

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < MAX_COUNT; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
