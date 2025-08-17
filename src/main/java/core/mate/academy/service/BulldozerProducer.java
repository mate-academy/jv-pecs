package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "Red", 500));
        bulldozers.add(new Bulldozer("Bulldozer2", "Black", 700));
        bulldozers.add(new Bulldozer("Bulldozer3", "Green", 600));
        return bulldozers;
    }
}
