package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Caterpillar", 1976, "used", "diesel");
        Bulldozer bulldozer2 = new Bulldozer("Komatsu", 1995, "used", "diesel");
        Bulldozer bulldozer3 = new Bulldozer("Liebherr", 2014, "used", "diesel");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
