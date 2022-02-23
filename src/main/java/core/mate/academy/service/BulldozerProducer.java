package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("has a ladle", "has caterpillars");
        Bulldozer bulldozer2 = new Bulldozer("has not ladle", "has caterpillars");
        Bulldozer bulldozer3 = new Bulldozer("has a ladle", "has not caterpillars");

        return List.of(bulldozer1, bulldozer2,bulldozer3);
    }
}
