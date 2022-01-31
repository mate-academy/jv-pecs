package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int DEFAULT_SIZE = 10;
    private List<Bulldozer> list = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }
}
