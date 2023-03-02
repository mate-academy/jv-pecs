package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MAX_WEIGHT_BOUND = 1000;

    @Override
    public List<Bulldozer> get() {
        Random randomWeight = new Random();
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < MODELS_AMOUNT; i++) {
            bulldozerList.add(new Bulldozer(randomWeight.nextInt(MAX_WEIGHT_BOUND)));
        }
        return bulldozerList;
    }
}
