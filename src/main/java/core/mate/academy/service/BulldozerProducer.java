package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("CAT", "White", 1000);
        Bulldozer secondBulldozer = new Bulldozer("CAT", "Black", 1500);
        Bulldozer thirdBulldozer = new Bulldozer("CAT", "Red", 2000);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
