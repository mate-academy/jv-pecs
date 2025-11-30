package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> machines = new ArrayList<>();
        machines.add(new Bulldozer());
        machines.add(new Bulldozer());

        return machines;
    }
}
