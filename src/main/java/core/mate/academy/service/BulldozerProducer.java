package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Bulldozer 1", "red", 11));
        list.add(new Bulldozer("Bulldozer 2", "blue", 12));
        return list;
    }
}
