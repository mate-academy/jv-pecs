package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUMBER = 3;
    private Random random = new Random();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < NUMBER; i++) {
            excavators.add(new Excavator(random.nextBoolean(), random.nextBoolean()));
        }
        return excavators;
    }
}
