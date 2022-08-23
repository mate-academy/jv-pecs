package core.mate.academy.service.impl;

import static core.mate.academy.enums.ExcavatorUsage.DEMOLITION;
import static core.mate.academy.enums.ExcavatorUsage.DIGGING;
import static core.mate.academy.enums.ExcavatorUsage.MINING;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(DIGGING));
        excavators.add(new Excavator(MINING));
        excavators.add(new Excavator(DEMOLITION));
        return excavators;
    }
}
