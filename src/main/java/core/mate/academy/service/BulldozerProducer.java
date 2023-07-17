package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final Bulldozer first = new Bulldozer();
    private static final Bulldozer second = new Bulldozer();
    private static final Bulldozer third = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        return List.of(first, second, third);
    }
}
