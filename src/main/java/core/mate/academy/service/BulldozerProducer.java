package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Caterpillar", "White", 660, 9));
        list.add(new Bulldozer("Komatsu", "Red", 700, 13));
        list.add(new Bulldozer("Hitachi", "Orange", 1000, 17));
        list.add(new Bulldozer("Caterpillar", "Red", 680, 11));
        return list;
    }
}
