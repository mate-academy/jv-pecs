package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        return list;
    }
}
