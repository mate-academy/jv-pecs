package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List get() {
        return List.of(new Bulldozer(),
                new Bulldozer(),
                new Bulldozer());
    }
}
