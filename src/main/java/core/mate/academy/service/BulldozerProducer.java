package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER = 7;
    private static final int MIN_YEAR = 1923;
    private static final int MAX_YEAR = 2023;

    private Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < NUMBER; i++) {
            bulldozers.add(new Bulldozer(MIN_YEAR + random.nextInt((MAX_YEAR - MIN_YEAR) + 1)));
        }
        return bulldozers;
    }
}
