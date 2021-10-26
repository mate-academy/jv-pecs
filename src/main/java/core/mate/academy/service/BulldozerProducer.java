package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer buldozer01 = new Bulldozer("Caterpillar", "Red", 1990, 15);
    private Bulldozer buldozer02 = new Bulldozer("Komatsu", "Yellow", 2005, 10);
    private Bulldozer buldozer03 = new Bulldozer("XTZ", "Green", 2010, 12);

    @Override
    public List<Bulldozer> get() {
        return List.of(buldozer01, buldozer02, buldozer03);
    }
}
