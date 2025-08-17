package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MACHINES_COUNT = 3;
    private static final int MAX_CARRYING_CAPACITY = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Truck> get() {
        List<Truck> result = new ArrayList<>();
        for (int i = 0; i < MACHINES_COUNT; i++) {
            result.add(new Truck("Truck " + i,
                    colorSupplier.getRandomColor().toString().toLowerCase(),
                    random.nextInt(MAX_CARRYING_CAPACITY)));
        }
        return result;
    }
}
