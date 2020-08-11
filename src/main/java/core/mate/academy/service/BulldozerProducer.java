package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer("volkswagen", 5000);
        Bulldozer bulldozerTwo = new Bulldozer("honda", 7000);
        return Arrays.asList(bulldozerOne, bulldozerTwo);
    }
}
