package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("V", 1111, 123),
                new Bulldozer("V", 2222, 123),
                new Bulldozer("V", 3333, 123));
    }
}


