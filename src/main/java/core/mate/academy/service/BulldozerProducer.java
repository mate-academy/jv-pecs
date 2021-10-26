package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer caterpillarBulldozer = new Bulldozer("Caterpillar", "Red", 1990, 15);
    private Bulldozer komatsuBulldozer = new Bulldozer("Komatsu", "Yellow", 2005, 10);
    private Bulldozer xtzBulldozer = new Bulldozer("XTZ", "Green", 2010, 12);

    @Override
    public List<Bulldozer> get() {
        return List.of(caterpillarBulldozer, komatsuBulldozer, xtzBulldozer);
    }
}
