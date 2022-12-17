package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }
}
