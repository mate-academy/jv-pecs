package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("type1", 1), new Bulldozer("type2", 2),
                new Bulldozer("type3", 3));
    }
}
