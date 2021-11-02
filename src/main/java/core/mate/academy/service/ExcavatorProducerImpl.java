package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer {
    private static final Excavator FIRST_EXCAVATOR = new Excavator("yellow", 1500, "JCB");
    private static final Excavator SECOND_EXCAVATOR = new Excavator("black", 500, "CATERPILLAR");
    private static final Excavator THIRD_EXCAVATOR = new Excavator("white", 1000, "HITACHI");

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(FIRST_EXCAVATOR);
        excavators.add(SECOND_EXCAVATOR);
        excavators.add(THIRD_EXCAVATOR);
        return excavators;
    }
}
