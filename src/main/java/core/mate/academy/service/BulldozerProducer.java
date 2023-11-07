package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULLDOZERS_NUMBER = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < BULLDOZERS_NUMBER; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }
}
