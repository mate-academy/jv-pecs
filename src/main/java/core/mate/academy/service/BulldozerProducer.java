package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static int MAX_COUNT = 10;
    private static int sizeRandom;

    @Override
    public List<Bulldozer> get() {
        sizeRandom = new Random().nextInt(MAX_COUNT);
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < sizeRandom; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
