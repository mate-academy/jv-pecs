package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<E> implements MachineProducer<E> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
