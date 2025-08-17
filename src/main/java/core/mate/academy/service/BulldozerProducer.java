package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private static final int BULLDOZER_COUNT = 3;
    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        for (int i = 0; i < BULLDOZER_COUNT; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
