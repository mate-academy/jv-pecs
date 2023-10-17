package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_BULLDOZERS = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_BULLDOZERS; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }
}
