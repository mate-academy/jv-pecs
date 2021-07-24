package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    private List<Bulldozer> list;

    public BulldozerProducer() {
        list = new ArrayList<>();
        list.add(new Bulldozer());
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
