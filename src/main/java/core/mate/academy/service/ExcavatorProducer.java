package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private static final int DEFAULT_SIZE = 10;
    private List<Machine> list = new ArrayList<>();

    ExcavatorProducer() {
        excavatorsSet();
    }

    private void excavatorsSet() {
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new Excavator());
        }
    }

    @Override
    public List<Machine> get() {
        return list;
    }
}
