package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private final List<Machine> bulldozerList = new ArrayList<>();

    @Override
    public List<Machine> get() {
        for (int i = 0; i < 3; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }
}
