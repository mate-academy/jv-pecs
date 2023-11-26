package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int DEFAULT_SIZE = 3;

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
