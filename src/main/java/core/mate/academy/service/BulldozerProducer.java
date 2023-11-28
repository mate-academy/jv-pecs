package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("First", "White", 200));
        list.add(new Bulldozer("Second", "Black", 180));
        list.add(new Bulldozer("Third", "Red", 220));
        return list;
    }
}
