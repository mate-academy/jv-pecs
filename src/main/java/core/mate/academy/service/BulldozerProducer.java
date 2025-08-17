package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("CAT", 550);
        Bulldozer secondBulldozer = new Bulldozer("JCB", 600);
        return List.of(firstBulldozer, secondBulldozer);
    }
}
