package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBERS_OF_ELEMENTS = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < NUMBERS_OF_ELEMENTS; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }
}
