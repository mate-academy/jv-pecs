package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer(2, 1, 100);
        Bulldozer secondBulldozer = new Bulldozer(4, 1, 200);
        Bulldozer thirdBulldozer = new Bulldozer(7, 2, 300);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
