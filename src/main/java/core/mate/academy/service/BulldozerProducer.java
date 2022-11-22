package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer {
    private static final int MAX_COUNT = 10;
    private int randomSize = new Random().nextInt(MAX_COUNT);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < MAX_COUNT; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
