package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static int MAX_COUNT = 10;
    private Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        int size = random.nextInt(MAX_COUNT);
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
