package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("BigBulldozer", "Red", 5));
        bulldozers.add(new Bulldozer("MiddleBulldozer", "Blue", 7));
        bulldozers.add(new Bulldozer("SmallBulldozer", "Yellow", 10));
        return bulldozers;
    }
}
