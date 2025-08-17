package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(new Bulldozer("Bulldozer1", "red"),
                new Bulldozer("Bulldozer2", "black"),
                new Bulldozer("Bulldozer3", "violet"));
    }
}
