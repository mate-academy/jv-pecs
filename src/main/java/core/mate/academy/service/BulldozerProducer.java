package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("first bulldozer", "white", 3.3),
                new Bulldozer("second bulldozer", "yellow", 2.5),
                new Bulldozer("third bulldozer", "green", 3)
        );
    }
}
