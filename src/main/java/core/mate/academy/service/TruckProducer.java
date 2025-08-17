package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    public static final int MAX_POWER = 500;
    private final Random random = new Random();

    @Override
    public List<Truck> get() {
        return List.of(new Truck("Scania", "Black", random.nextInt(MAX_POWER), true),
                new Truck("Man", "White", random.nextInt(MAX_POWER), true),
                new Truck("Renault", "Blue", random.nextInt(MAX_POWER), false)
        );
    }
}
