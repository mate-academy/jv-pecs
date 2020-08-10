package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer first = new Bulldozer(22, true);
        Bulldozer second = new Bulldozer(28, false);
        List<Bulldozer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        return list;
    }
}
