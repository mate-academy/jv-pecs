package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer smallBulldozer = new Bulldozer(2, 5);
        Bulldozer mediumBulldozer = new Bulldozer(4, 7);
        Bulldozer giantBulldozer = new Bulldozer(8, 25);
        return List.of(smallBulldozer, mediumBulldozer, giantBulldozer);
    }
}
