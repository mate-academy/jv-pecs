package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("U"));
        bulldozers.add(new Bulldozer("S"));
        bulldozers.add(new Bulldozer("S-U"));
        return bulldozers;
    }
}
