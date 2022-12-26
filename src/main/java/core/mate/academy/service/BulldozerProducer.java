package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List get() {
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        return List.of(firstBulldozer, secondBulldozer);
    }
}
