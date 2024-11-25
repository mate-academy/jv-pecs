package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Acp", "white", 2.4));
        bulldozers.add(new Bulldozer("CAT", "yellow", 5.2));
        bulldozers.add(new Bulldozer("Ostrich", "black", 6.0));
        return bulldozers;
    }
}
