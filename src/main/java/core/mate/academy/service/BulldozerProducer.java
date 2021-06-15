package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Black", "Bulldozer1"),
            new Bulldozer("White", "Bulldozer2"),
            new Bulldozer("Red","Bulldozer3"));
    }
}

