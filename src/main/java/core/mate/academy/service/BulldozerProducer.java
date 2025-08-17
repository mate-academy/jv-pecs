package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("Caterpillar", "yellow", 20.0),
                new Bulldozer("Liebherr", "yellow", 25.0),
                new Bulldozer("Komatsu", "yellow", 21.0)
        );
    }
}
