package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerMachineProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Bulldozer("Model " + (int)(Math.random() * 100), i));
        }
        return list;
    }
}
