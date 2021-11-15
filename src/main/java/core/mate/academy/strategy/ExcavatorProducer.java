package core.mate.academy.strategy;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int COUNT_OF_MACHINES = 2;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
