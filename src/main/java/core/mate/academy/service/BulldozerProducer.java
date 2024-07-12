package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("BD-1", "Red", 5));
        bulldozers.add(new Bulldozer("BD-2", "Blue", 6));
        bulldozers.add(new Bulldozer("BD-3", "Black", 4));
        return bulldozers;
    }
}
