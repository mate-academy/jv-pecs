package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}
