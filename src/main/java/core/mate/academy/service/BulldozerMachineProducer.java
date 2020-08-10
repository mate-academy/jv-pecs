package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerMachineProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_MACHINES = 3;
    private static final int RANGE_OF_RANDOM_VALUE = 1000;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            list.add(new Bulldozer("Model " + (new Random().nextInt(RANGE_OF_RANDOM_VALUE)), i));
        }
        return list;
    }
}
