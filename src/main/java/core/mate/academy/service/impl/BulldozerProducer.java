package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
            List<Bulldozer> list = new java.util.ArrayList<>(List.of());
            list.add(new Bulldozer(23.2, "Steel"));
            list.add(new Bulldozer(10.5, "Rubber"));
            return list;
    }
}
