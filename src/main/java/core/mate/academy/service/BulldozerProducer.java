package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer caterpillar = new Bulldozer();
    private final Bulldozer komatsu = new Bulldozer();
    private final Bulldozer johnDeere = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        return List.of(caterpillar, komatsu, johnDeere);
    }
}
