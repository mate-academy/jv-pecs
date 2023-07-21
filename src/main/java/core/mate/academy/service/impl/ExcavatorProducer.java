package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUMBERS_OF_ELEMENTS = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < NUMBERS_OF_ELEMENTS; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
