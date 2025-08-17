package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private Bulldozer[] models = {
            new Bulldozer(10, 5),
            new Bulldozer(20, 10),
            new Bulldozer(30, 15)
    };

    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(models);
    }
}
