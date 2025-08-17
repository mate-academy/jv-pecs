package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Bulldozer1", "yellow", "new"),
                new Bulldozer("Bulldozer2", "blue", "new"),
                new Bulldozer("Bulldozer3", "green", "old"));
    }
}
