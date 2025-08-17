package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(24.6, "Red", "Worker1"));
        bulldozers.add(new Bulldozer(18.3, "Black", "Worker2"));
        bulldozers.add(new Bulldozer(14.6, "Blue", "Worker3"));
        return bulldozers;
    }
}
