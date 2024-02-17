package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<? extends Machine> get() {
        return List.of(new Bulldozer("t7000"),
                new Bulldozer("t3000"),
                new Bulldozer("t5000"));
    }
}
