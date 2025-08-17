package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("Bulldozer 1", "red"),
                new Bulldozer("Bulldozer 2", "green"),
                new Bulldozer("Bulldozer 3", "blue")
        );
    }
}
