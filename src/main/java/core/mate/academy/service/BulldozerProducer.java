package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_MODELS = 5;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setName("Bulldozer nr " + i);
            bulldozer.setColor("Pink");
            bulldozer.setBulldozingLevel(i + 1 );
            bulldozers.add(bulldozer);
        }
        return bulldozers;
    }
}