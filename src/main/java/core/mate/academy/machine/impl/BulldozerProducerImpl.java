package core.mate.academy.machine.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();

        bulldozerList.add(new Bulldozer("Bulldozer1", "Red", 1));
        bulldozerList.add(new Bulldozer("Bulldozer2", "White", 2));
        bulldozerList.add(new Bulldozer("Bulldozer3", "Black", 3));
        bulldozerList.add(new Bulldozer("Bulldozer4", "Orange", 4));
        bulldozerList.add(new Bulldozer("Bulldozer5", "Green", 5));

        return bulldozerList;
    }
}
