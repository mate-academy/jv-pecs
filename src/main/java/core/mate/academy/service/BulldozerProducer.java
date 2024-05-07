package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public static final int MAX_POWER = 100;
    public static final int MAX_WEIGHT = 10000;
    private final Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Caterpillar", "Red",
                        random.nextInt(MAX_POWER), random.nextInt(MAX_WEIGHT)),
                new Bulldozer("Liebherr", "Yellow",
                        random.nextInt(MAX_POWER), random.nextInt(MAX_WEIGHT)),
                new Bulldozer("Komatsu", "Orange",
                        random.nextInt(MAX_POWER), random.nextInt(MAX_WEIGHT))
        );
    }
}
