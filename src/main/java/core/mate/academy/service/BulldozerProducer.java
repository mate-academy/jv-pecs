package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list = new ArrayList<>();

    public BulldozerProducer() {
        list.add(new Bulldozer(220, "ROBO-20"));
        list.add(new Bulldozer(200, "ROBO-20PRO"));
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
