package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER = 2;

    private List<Bulldozer> list;

    public BulldozerProducer() {
        list = new ArrayList<>(
                Collections.nCopies(NUMBER, new Bulldozer())
        );
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
