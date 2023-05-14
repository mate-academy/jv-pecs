package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("Crash", "Green", 10, 12),
                new Bulldozer("ZARA", "Grey", 5, 5),
                new Bulldozer("Dan", "Yellow", 7, 7));
    }
}
