package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer8 = new Bulldozer(162, 25.5);
        Bulldozer bulldozer16 = new Bulldozer(257, 34.1);
        Bulldozer bulldozer32 = new Bulldozer(268, 41.2);
        return Arrays.asList(bulldozer8, bulldozer16, bulldozer32);
    }
}
