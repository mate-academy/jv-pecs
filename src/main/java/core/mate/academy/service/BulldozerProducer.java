package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> resultBulldozer = new ArrayList<>();
        resultBulldozer.add(new Bulldozer("bulld1", "b1", 15));
        resultBulldozer.add(new Bulldozer("bulld2", "b2", 25));
        resultBulldozer.add(new Bulldozer("bulld3", "b3", 35));
        return resultBulldozer;
    }
}
