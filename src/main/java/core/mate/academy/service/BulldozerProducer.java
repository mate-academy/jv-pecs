package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("firstBulldozer", "Orange", 100);
        Bulldozer secondBulldozer = new Bulldozer("secondBulldozer", "Gray", 200);
        Bulldozer thirdBulldozer = new Bulldozer("thirdBulldozer", "Black", 300);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
