package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer FIRST = new Bulldozer();
    private final Bulldozer SECOND = new Bulldozer();
    private final Bulldozer THIRD = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(FIRST);
        bulldozers.add(SECOND);
        bulldozers.add(THIRD);
        return bulldozers;
    }
}
