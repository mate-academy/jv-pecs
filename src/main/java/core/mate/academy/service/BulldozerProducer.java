package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<Bulldozer> bulldozerList = new ArrayList<>();

    public BulldozerProducer() {
        bulldozerList.add(new Bulldozer());
    }

    @Override
    public List get() {
        return bulldozerList;
    }
}
