package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerBuilder implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(1500),
                new Bulldozer(2000), new Bulldozer(5000));
    }
}
