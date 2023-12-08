package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Bulldozer 1", "yellow", 3.0);
        Bulldozer secondBulldozer = new Bulldozer("Bulldozer 2", "red", 2.0);
        Bulldozer thirdBulldozer = new Bulldozer("Bulldozer 3", "orange", 2.5);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
