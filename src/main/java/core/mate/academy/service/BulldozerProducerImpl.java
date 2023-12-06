package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer X20", "Yellow", 50.5, 2);
        bulldozerList.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer X10", "Yellow", 40.5, 1);
        bulldozerList.add(bulldozer2);
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer X3", "Orange", 30.0, 1);
        bulldozerList.add(bulldozer3);
        return bulldozerList;
    }
}
