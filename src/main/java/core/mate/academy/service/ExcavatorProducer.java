package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        return List.of(new Excavator(20, true),
                new Excavator(25, false),
                new Excavator(30, true));
    }
}
