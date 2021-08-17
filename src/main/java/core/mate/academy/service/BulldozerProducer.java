package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("buldozer-M1","pink", 125),
                new Bulldozer("buldozer-M2", "grey", 94));
    }
}
