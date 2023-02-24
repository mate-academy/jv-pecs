package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public String getClassName() {
        return Bulldozer.class.toString();
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i < MACHINE_NUMBER_FOR_CREATE; i++) {
            list.add(new Bulldozer());
        }
        return list;
    }
}
