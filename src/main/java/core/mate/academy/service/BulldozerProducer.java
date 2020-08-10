package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Belarus", 2019);
        Bulldozer secondBulldozer = new Bulldozer();
        return Arrays.asList(firstBulldozer, secondBulldozer);
    }
}
