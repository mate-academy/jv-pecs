package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private static final int DEFAULT_FUEL_CONSUMPTION = 20;
    private static final int DEFAULT_WEIGHT = 17;
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < MACHINES_QUANTITY; i++) {
            excavators.add(new Excavator(DEFAULT_FUEL_CONSUMPTION, DEFAULT_WEIGHT));
        }
        return excavators;
    }
}
