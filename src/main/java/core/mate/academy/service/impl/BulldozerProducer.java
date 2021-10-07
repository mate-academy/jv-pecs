package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer one = new Bulldozer("OneBulldozer", "Red", "Germany");
        Bulldozer two = new Bulldozer("TwoBulldozer", "Green", "Spain");
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(one);
        bulldozerList.add(two);
        return bulldozerList;
    }
}
