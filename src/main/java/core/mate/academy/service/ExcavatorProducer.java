package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private final List<Machine> excavators;

    public ExcavatorProducer() {
        excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
    }

    @Override
    public List<? extends Machine> get() {
        return excavators;
    }
}
