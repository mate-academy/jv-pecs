package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int COUNT_EXCAVATORS = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < COUNT_EXCAVATORS; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
