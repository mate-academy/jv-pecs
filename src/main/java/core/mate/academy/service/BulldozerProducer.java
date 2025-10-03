package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("CAT", "Orange", 2000, 1345.0, 500));
        bulldozers.add(new Bulldozer("CAT2", "Black", 2100, 1500.0, 800));
        return bulldozers;
    }
}
