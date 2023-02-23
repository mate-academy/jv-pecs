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
        Bulldozer wheelDozer = new Bulldozer("S-type", true);
        Bulldozer crawlerBulldozer = new Bulldozer("U-type", false);
        list.add(wheelDozer);
        list.add(crawlerBulldozer);
    }
}
