package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_COUNT = 10;
    private int randomSize = new Random().nextInt(MAX_COUNT);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < MAX_COUNT; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
