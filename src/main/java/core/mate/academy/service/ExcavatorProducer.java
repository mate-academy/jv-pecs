package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    List<Excavator> list = new ArrayList<>();
    Excavator excavator = new Excavator();
    @Override
    public List<Excavator> get() {
        list.add(excavator);
        return list;
    }
}
