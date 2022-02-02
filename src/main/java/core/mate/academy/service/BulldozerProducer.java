package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public static final int SIZE_OF_LIST = 5;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }
}
