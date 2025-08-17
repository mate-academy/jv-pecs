package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
