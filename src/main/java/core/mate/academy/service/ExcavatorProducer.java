package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int INITIAL_SIZE = 5;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < INITIAL_SIZE; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
