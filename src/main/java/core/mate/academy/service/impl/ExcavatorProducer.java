package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return List.of(new Excavator(), new Excavator(), new Excavator());
    }
}
