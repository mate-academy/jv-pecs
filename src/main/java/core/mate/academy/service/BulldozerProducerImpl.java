package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private static final List<Bulldozer> bulldozers = new ArrayList<>();

    {
        bulldozers.add(new Bulldozer(85, 15));
        bulldozers.add(new Bulldozer(3, 105));
        bulldozers.add(new Bulldozer(56, 12365));
        bulldozers.add(new Bulldozer(4, 12));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
