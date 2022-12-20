package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private final List<Bulldozer> bulldozers;

    public BulldozerProducer() {
        bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
