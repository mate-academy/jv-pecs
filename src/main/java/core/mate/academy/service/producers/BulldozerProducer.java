package core.mate.academy.service.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(
                new Bulldozer("Bulldozer1", "Red", "Simple Ripper"),
                new Bulldozer("Bulldozer2", "Red", "Cool Ripper"));
    }
}
