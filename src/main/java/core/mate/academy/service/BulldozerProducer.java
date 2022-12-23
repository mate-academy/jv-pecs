package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List get() {
        Bulldozer bulldozer = new Bulldozer();
        Bulldozer bulldozer1 = new Bulldozer();
        return Arrays.asList(bulldozer, bulldozer1);
    }
}
