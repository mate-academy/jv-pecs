package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer one = new Bulldozer("one", 1, 1.1);
        Bulldozer two = new Bulldozer("two", 2, 2.2);
        Bulldozer three = new Bulldozer("three", 3, 3.3);
        return List.of(one, two, three);
    }
}
