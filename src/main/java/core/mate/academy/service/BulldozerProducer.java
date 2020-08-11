package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer("DT-75", 95);
        Bulldozer bulldozerTwo = new Bulldozer("DZ-53", 108);
        Bulldozer bulldozerThird = new Bulldozer("D-259", 108);
        return Arrays.asList(bulldozerOne, bulldozerTwo, bulldozerThird);
    }
}
