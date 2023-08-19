package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 1;
    private final Random random = new Random();

    @Override
    public List<Truck> get() {
        int number = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
