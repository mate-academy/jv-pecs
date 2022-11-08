package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("firstBulldozer", "Blue", 230);
        Bulldozer secondBulldozer = new Bulldozer("secondBulldozer", "Yellow", 290);
        Bulldozer thirdBulldozer = new Bulldozer("thirdBulldozer", "Red", 260);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
