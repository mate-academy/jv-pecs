package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("crawler", 120000.0);
        Bulldozer bulldozer2 = new Bulldozer("wheeled", 11000.0);
        Bulldozer bulldozer3 = new Bulldozer("crawler", 33000.0);
        return Arrays.asList(bulldozer1, bulldozer2, bulldozer3);
    }
}
