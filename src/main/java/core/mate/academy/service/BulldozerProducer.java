package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer<T extends Bulldozer> implements MachineProducer<T> {
    @Override
    public List<? extends Machine> get() {
        return List.of(new Bulldozer("CAT", "yellow", 4),
                new Bulldozer("JohnDeere", "green", 3),
                new Bulldozer("JCB", "Orange", 2));
    }
}
