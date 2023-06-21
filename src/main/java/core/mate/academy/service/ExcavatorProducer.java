package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int INITIAL_SIZE = 5;
    private final List<Excavator> excavators;

    public ExcavatorProducer() {
        this.excavators = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        for (int i = 0; i < INITIAL_SIZE; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
