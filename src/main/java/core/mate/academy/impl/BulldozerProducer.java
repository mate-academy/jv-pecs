package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<Bulldozer> bulldozerList = new ArrayList<>();

    @Override
    public List get() {
        bulldozerList.add(new Bulldozer("buldoz1", "black", 4000));
        bulldozerList.add(new Bulldozer("buldoz2", "red", 5000));
        bulldozerList.add(new Bulldozer("buldoz3", "yellow", 4500));
        return bulldozerList;
    }
}
