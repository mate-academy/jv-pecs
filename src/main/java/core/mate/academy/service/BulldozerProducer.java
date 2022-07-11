package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("S blade", 500));
        list.add(new Bulldozer("U blade", 603));
        list.add(new Bulldozer("S-U blade", 504));
        return list;
    }
}
