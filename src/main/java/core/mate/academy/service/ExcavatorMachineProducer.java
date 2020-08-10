package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorMachineProducer implements MachineProducer<Excavator> {
    private static final int NUMBER_OF_MACHINES = 3;
    private static final int RANGE_OF_RANDOM_VALUE = 1000;

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            list.add(new Excavator("Model " + (new Random().nextInt(RANGE_OF_RANDOM_VALUE)), i));

        }
        return list;
    }
}
