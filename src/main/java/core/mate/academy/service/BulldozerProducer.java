package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MACHINES_COUNT = 3;
    private static final int MAX_DUMP_WIDTH = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> result = new ArrayList<>();
        for (int i = 0; i < MACHINES_COUNT; i++) {
            result.add(new Bulldozer("Bulldozer " + i,
                    colorSupplier.getRandomColor().toString().toLowerCase(),
                    random.nextInt(MAX_DUMP_WIDTH)));
        }
        return result;
    }
}
