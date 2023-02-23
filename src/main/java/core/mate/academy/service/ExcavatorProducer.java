package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private final List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        excavators.add(new Excavator());
        return excavators;
    }
}
