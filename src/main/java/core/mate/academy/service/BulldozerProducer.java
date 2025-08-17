package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list = new ArrayList<>();

    public BulldozerProducer() {
        list.add(new Bulldozer(1999, "S-11"));
        list.add(new Bulldozer(2014, "T-45"));
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
