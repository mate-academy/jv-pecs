package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        final Bulldozer bulldozer1 = new Bulldozer();
        final Bulldozer bulldozer2 = new Bulldozer();
        final Bulldozer bulldozer3 = new Bulldozer();
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
