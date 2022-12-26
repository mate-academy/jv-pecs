package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> excavatorList = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        for (int i = 0; i < 3; i++) {
            excavatorList.add(i, new Excavator());
        }
        return excavatorList;
    }
}
