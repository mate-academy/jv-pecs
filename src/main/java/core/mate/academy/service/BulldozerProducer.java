package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_BULLDOZERS = 5;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> result = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_BULLDOZERS; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setBig(i % 2 == 0);
            result.add(bulldozer);
        }
        return result;
    }
}
