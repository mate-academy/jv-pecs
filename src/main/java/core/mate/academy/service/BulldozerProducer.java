package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private static final int BATCH_SIZE = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        ColorManager colorManager = new ColorManager();
        for (int i = 1; i <= BATCH_SIZE; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setName("Bulldozer #" + i);
            bulldozer.setColor(colorManager.getRandomColor());
            bulldozers.add(bulldozer);
        }
        return bulldozers;
    }
}
