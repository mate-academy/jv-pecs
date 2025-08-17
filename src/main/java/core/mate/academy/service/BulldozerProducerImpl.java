package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Bulldozer X20", "Yellow", 50.5, 2));
        bulldozerList.add(new Bulldozer("Bulldozer X10", "Yellow", 40.5, 1));
        bulldozerList.add(new Bulldozer("Bulldozer X3", "Orange", 30.0, 1));
        return bulldozerList;
    }
}
