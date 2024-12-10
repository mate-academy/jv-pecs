package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setBladeWidth(5);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setBladeWidth(7);

        return Arrays.asList(bulldozer1, bulldozer2);
    }
}
