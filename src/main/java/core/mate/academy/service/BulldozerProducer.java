package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_MODELS = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setName("Bulldozer " + i);
            bulldozer.setColor("Yellow");
            bulldozer.setPower((i + 1) * 50);
            bulldozers.add(bulldozer);
        }
        return bulldozers;
    }
}
