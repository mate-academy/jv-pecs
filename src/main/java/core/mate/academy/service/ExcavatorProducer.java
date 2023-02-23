package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer extends Machine implements MachineProducer {
    private static final int COUNT_EXCAVATORS = 3;

    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < COUNT_EXCAVATORS; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }

    @Override
    public void doWork() {

    }
}
