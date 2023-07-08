package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer(100, 101, 111);
        Bulldozer secondBulldozer = new Bulldozer(200, 202, 222);
        Bulldozer thirdBulldozer = new Bulldozer(300, 303, 333);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
