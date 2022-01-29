package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private static final int DEFAULT_SIZE = 10;
    private List<Machine> list = new ArrayList<>();

    BulldozerProducer() {
        bulldozersSet();
    }

    private void bulldozersSet() {
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new Bulldozer());
        }
    }

    @Override
    public List<Machine> get() {
        return list;
    }
}
