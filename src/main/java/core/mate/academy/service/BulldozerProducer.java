package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        bulldozerList.add(new Bulldozer());
        return bulldozerList;
    }
}
