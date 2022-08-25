package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUMBER_OF_EXCAVATORS = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_EXCAVATORS; i++) {
            excavators.add(new Excavator(i, String.valueOf(i), i % 2 == 0));
        }
        return excavators;
    }
}
