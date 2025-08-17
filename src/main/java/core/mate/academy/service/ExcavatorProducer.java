package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.LinkedList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new LinkedList<>();
        final int size = 3;
        for (int i = 0; i < size; i++) {
            excavators.add(new Excavator(i));
        }

        return excavators;
    }
}
