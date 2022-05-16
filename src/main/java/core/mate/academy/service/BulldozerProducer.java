package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Cat", "Yellow", "124-inches", "C3.6");
        Bulldozer secondBulldozer = new Bulldozer("Cat", "Yellow", "113-inches", "C27");
        Bulldozer thirdBulldozer = new Bulldozer("Cat", "Yellow", "111-inches", "C32");
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
