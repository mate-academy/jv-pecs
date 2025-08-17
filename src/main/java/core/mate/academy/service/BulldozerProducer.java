package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final Bulldozer firstBulldozer = new Bulldozer();
    private static final Bulldozer secondBulldozer = new Bulldozer();
    private static final Bulldozer thirdBulldozer = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
