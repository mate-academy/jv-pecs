package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int COUNT_BULLDOZER = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listBulldozer = new ArrayList<>();
        for (int i = 0; i < COUNT_BULLDOZER; i++) {
            listBulldozer.add(new Bulldozer());
        }
        return listBulldozer;
    }
}
