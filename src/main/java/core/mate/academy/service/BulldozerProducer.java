package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer(true, 1500),
                new Bulldozer(true, 2000),
                new Bulldozer(false, 1100)
        );
    }
}
