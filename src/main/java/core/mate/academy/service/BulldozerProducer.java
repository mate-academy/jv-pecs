package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("pink", 125),
                new Bulldozer("grey", 94));
    }
}
