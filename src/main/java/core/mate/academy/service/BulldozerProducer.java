package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer caterpillar = new Bulldozer();
    private Bulldozer hitachi = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        return List.of(caterpillar, hitachi);
    }
}


