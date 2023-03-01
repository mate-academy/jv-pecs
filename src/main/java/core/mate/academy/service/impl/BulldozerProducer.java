package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> list = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        createMachines();
        return list;
    }

    private void createMachines() {
        list.add(new Bulldozer("S-type", true));
        list.add(new Bulldozer("U-type", false));
    }
}
