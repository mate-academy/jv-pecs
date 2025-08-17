package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "Red", 10));
        bulldozers.add(new Bulldozer("Bulldozer2", "Cyan", 13));
        bulldozers.add(new Bulldozer("Bulldozer3", "Black", 17));
        return bulldozers;
    }
}
