package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULLDOZERS_QUANTITY = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < BULLDOZERS_QUANTITY; i++) {
            bulldozers.add(new Bulldozer("Cat " + i, i));
        }
        return bulldozers;
    }
}
