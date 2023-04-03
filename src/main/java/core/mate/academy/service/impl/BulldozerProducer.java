package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("mineWorks", 24.6));
        bulldozers.add(new Bulldozer("buildingWorks", 18.3));
        bulldozers.add(new Bulldozer("agricultureWorks", 28.9));
        return bulldozers;
    }
}
