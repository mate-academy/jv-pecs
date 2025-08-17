package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int DEFAULT_SIZE = 10;
    private List<Excavator> list = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
