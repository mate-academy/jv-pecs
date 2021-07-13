package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer oneCubeBulldozer = new Bulldozer(1);
        Bulldozer oneAndHalfCubeBulldozer = new Bulldozer(1.5);
        return List.of(oneCubeBulldozer, oneAndHalfCubeBulldozer);
    }
}
