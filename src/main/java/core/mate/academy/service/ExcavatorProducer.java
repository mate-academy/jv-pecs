package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int DEFAULT_LIST_LENGTH = 5;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < DEFAULT_LIST_LENGTH; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
