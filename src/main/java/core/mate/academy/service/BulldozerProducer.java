package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(1000,3000),
                new Bulldozer(500, 1000),
                new Bulldozer(300,500));
    }
}
