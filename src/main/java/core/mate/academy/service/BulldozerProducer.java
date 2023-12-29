package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer smallBulldozer = new Bulldozer(20);
        Bulldozer mediumBulldozer = new Bulldozer(30);
        Bulldozer bigBulldozer = new Bulldozer(40);
        return List.of(bigBulldozer, mediumBulldozer, smallBulldozer);
    }
}
