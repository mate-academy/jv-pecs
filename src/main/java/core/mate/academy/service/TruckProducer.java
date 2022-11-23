package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_COUNT = 10;
    private Random random = new Random();

    @Override
    public List<Truck> get() {
        int size = random.nextInt(MAX_COUNT);
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
