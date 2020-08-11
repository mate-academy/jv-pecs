package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new LinkedList<>();
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        return list;
    }
}
