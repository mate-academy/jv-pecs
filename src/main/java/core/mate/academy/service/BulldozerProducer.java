package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer firstBulldozer = new Bulldozer("Bulldozer 1", "yellow", 3.0);
    private final Bulldozer secondBulldozer = new Bulldozer("Bulldozer 2", "red", 2.0);
    private final Bulldozer thirdBulldozer = new Bulldozer("Bulldozer 3", "orange", 2.5);

    @Override
    public List<Bulldozer> get() {
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
