package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(3400, 90), new Bulldozer(1800, 110));
    }
}
