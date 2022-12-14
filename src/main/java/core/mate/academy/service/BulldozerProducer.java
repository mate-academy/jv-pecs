package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerGarry = new Bulldozer("Garry", "dirt", 330, "wheels");
        Bulldozer bulldozerCat = new Bulldozer("Caterpillar", "yellow", 540, "caterpillars");
        Bulldozer bulldozerJbc = new Bulldozer("JBC", "yellow", 350, "caterpillars");
        return List.of(bulldozerGarry, bulldozerCat, bulldozerJbc);
    }
}
