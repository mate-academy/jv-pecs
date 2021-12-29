package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        list.add(bulldozer);
        return list;
    }
}
