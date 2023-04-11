package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;
import core.mate.academy.model.Bulldozer;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> resultBulldozer = new ArrayList<>();
        resultBulldozer.add(new Bulldozer("bul1", "b1", "11"));
        resultBulldozer.add(new Bulldozer("bul2", "b2", "22"));
        resultBulldozer.add(new Bulldozer("bul33", "b3", "33"));
        return resultBulldozer;
    }
}
