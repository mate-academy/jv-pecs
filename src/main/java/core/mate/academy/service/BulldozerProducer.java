package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozer1", "LightBlue", 4));
        bulldozers.add(new Bulldozer("bulldozer2", "Red", 7));
        return bulldozers;
    }
}
