package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("nameOne", "white", 22));
        list.add(new Bulldozer("nameTwo", "black", 12));
        list.add(new Bulldozer("nameThree", "yellow", 10));
        return list;
    }
}
