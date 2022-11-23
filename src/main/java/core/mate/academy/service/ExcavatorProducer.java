package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static int MAX_COUNT = 10;
    private Random random;

    @Override
    public List<Excavator> get() {
        int size = random.nextInt(MAX_COUNT);
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
