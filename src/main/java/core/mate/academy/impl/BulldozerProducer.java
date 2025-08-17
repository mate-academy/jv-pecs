package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("BL1", "Black", 500));
        bulldozerList.add(new Bulldozer("BL2", "Grey", 800));
        return bulldozerList;
    }
}
