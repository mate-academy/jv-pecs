package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer 1", "Yellow", 100));
        bulldozers.add(new Bulldozer("Bulldozer 2", "Red", 120));
        bulldozers.add(new Bulldozer("Bulldozer 3", "Green", 90));
        return bulldozers;
    }
}
