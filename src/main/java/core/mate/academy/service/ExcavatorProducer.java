package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MACHINES_COUNT = 3;
    private static final int MAX_BUCKET_CAPACITY = 10;
    private static final int MAX_PRODUCTIVITY = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Excavator> get() {
        List<Excavator> result = new ArrayList<>();
        for (int i = 0; i < MACHINES_COUNT; i++) {
            result.add(new Excavator("Excavator " + i,
                    colorSupplier.getRandomColor().toString().toLowerCase(),
                    random.nextInt(MAX_BUCKET_CAPACITY),
                    random.nextInt(MAX_PRODUCTIVITY)));
        }
        return result;
    }
}
