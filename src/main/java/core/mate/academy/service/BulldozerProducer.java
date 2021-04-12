package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("CAT", "yellow", 4),
                new Bulldozer("JohnDeere", "green", 3),
                new Bulldozer("JCB", "Orange", 2));
    }
}
