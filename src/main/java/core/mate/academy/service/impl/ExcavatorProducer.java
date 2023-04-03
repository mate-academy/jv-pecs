package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1498, "Black", "Worker4"));
        excavators.add(new Excavator(1254, "Red", "Worker5"));
        excavators.add(new Excavator(964, "White", "Worker6"));
        return excavators;
    }
}
