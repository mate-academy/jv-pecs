package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list;

    public BulldozerProducer() {
        list = new ArrayList<>();
        list.add(new Bulldozer("Bulldozer1", "yellow", "AAAA", 0.6f));
        list.add(new Bulldozer("Bulldozer2", "red", "BBBB", 1.5f));
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
