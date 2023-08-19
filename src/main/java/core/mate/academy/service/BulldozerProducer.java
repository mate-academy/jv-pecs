package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 1;
    private final Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        int number = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }
}
