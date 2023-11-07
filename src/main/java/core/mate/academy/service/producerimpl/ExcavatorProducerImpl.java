package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private static final int DEFAULT_EXCAVATOR_NUMBER = 10;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < DEFAULT_EXCAVATOR_NUMBER; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
