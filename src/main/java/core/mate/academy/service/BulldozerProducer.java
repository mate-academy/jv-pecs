package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "red", 2000, "B1"));
        bulldozers.add(new Bulldozer("Bulldozer2", "blue", 1500, "B2"));
        return bulldozers;
    }
}
