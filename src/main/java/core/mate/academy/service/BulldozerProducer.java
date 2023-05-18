package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("V", 1111, 123);
        Bulldozer bulldozer2 = new Bulldozer("V", 2222, 123);
        Bulldozer bulldozer3 = new Bulldozer("V", 3333, 123);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
