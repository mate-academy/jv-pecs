package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<? extends Bulldozer> get() {
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}
