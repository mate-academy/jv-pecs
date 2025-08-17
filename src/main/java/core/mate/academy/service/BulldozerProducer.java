package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("bulldozer", "yellow", 1500),
                new Bulldozer("bulldozer1", "Yellow", 1300),
                new Bulldozer("bulldozer2", "Red", 1700));
    }
}
