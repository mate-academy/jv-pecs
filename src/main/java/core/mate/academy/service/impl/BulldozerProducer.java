package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozer1", "green"));
        bulldozers.add(new Bulldozer("bulldozer2", "yellow"));
        bulldozers.add(new Bulldozer("bulldozer3", "blue"));
        return bulldozers;
    }
}
