package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Caterpillar D6R", "yellow", 2017));
        list.add(new Bulldozer("Caterpillar 963", "black", 1992));
        list.add(new Bulldozer("Caterpillar D6N", "brown", 1986));
        return list;
    }
}
