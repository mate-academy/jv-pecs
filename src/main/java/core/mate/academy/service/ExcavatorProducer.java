package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int SIZE_OF_LIST = 10;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
