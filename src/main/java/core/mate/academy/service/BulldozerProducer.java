package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

git public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> resultBulldozer = new ArrayList<>();
        resultBulldozer.add(new Bulldozer("Red", 211, 4));
        resultBulldozer.add(new Bulldozer("Yellow", 312, 3));
        resultBulldozer.add(new Bulldozer("White", 412, 5));
        return resultBulldozer;
    }
}
