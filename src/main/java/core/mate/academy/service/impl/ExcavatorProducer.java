package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("heavy", 1564));
        excavators.add(new Excavator("medium", 1130));
        excavators.add(new Excavator("light", 840));
        return excavators;
    }
}
