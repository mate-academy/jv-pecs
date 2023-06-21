package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int INITIAL_SIZE = 5;
    private final List<Bulldozer> bulldozers;

    public BulldozerProducer() {
        bulldozers = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        for (int i = 0; i < INITIAL_SIZE; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
