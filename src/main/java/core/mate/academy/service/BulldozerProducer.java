package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("Track type 1", "Cab type 1", 100),
                new Bulldozer("Track type 2", "Cab type 2", 200),
                new Bulldozer("Track type 3", "Cab type 3", 300));
    }
}
