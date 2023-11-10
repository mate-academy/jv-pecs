package core.mate.academy.model.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int OBJECT_COUNT = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < OBJECT_COUNT; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
