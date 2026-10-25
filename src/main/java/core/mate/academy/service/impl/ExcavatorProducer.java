package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new java.util.ArrayList<>(List.of());
        list.add(new Excavator(60.1, 5));
        list.add(new Excavator(120.5,10));
        return list;
    }
}
