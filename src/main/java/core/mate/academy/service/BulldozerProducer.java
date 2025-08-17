package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUM_OF_BULDOZERS = 3;
    private List<Bulldozer> list = new ArrayList<>();

    public BulldozerProducer() {
        Random random = new Random();

        for (int i = 0; i < NUM_OF_BULDOZERS; i++) {
            list.add(new Bulldozer(random.nextInt(5)));
        }

    }

    public BulldozerProducer(List<Bulldozer> list) {
        this.list = list;
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
