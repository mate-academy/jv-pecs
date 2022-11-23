package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_COUNT = 10;
    private static int sizeRandom;

    @Override
    public List<Truck> get() {
        sizeRandom = new Random().nextInt(MAX_COUNT);
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < sizeRandom; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
