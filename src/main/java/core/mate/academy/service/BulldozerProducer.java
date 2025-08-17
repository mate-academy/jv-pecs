package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUM_BULLDOZERS = 2;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < NUM_BULLDOZERS; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
