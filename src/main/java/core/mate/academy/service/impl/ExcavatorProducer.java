package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = List.of(new Excavator(), new Excavator());

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
