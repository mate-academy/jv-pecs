package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("bull1", "Green", "turning");
        Bulldozer bulldozer2 = new Bulldozer("bull2", "Black", "fixed");
        Bulldozer bulldozer3 = new Bulldozer("bull3", "Red", "universal");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
