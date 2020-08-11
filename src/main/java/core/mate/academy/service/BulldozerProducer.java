package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(false, 500);
        Bulldozer bulldozer2 = new Bulldozer(true, 250);
        Bulldozer bulldozer3 = new Bulldozer(true, 50);
        return Arrays.asList(bulldozer1, bulldozer2, bulldozer3);
    }
}
