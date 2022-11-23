package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static int MAX_COUNT = 10;
    private static int sizeRandom;

    @Override
    public List<Excavator> get() {
        sizeRandom = new Random().nextInt(MAX_COUNT);
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < sizeRandom; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
