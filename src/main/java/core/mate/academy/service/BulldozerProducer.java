package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> list;

    public BulldozerProducer() {
        this.list = new ArrayList<>();
        list.add(new Bulldozer(1000,true));
        list.add(new Bulldozer(1500,false));
        list.add(new Bulldozer(2000,true));
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
