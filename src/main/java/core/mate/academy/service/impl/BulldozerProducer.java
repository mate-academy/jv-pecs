package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bulldozerList.add(i, new Bulldozer());
        }
        return bulldozerList;
    }
}
