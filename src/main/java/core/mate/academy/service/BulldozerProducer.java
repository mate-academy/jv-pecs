package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public BulldozerProducer() {
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer());
        list.add(new Bulldozer(30, 50, 40));
        list.add(new Bulldozer(500, 50, 900));
        return list;
    }
}
