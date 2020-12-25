package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("bulldozer", "red", "trackName", "cab"),
                new Bulldozer("bulldozer2", "blue", "tracName2", "cab2"),
                new Bulldozer()
        );
    }
}
