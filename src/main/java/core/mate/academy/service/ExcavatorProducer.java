package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUMBER = 2;

    private List<Excavator> list;

    public ExcavatorProducer() {
        list = new ArrayList<>(
                Collections.nCopies(NUMBER, new Excavator())
        );
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
