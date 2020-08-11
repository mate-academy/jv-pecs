package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.LinkedList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new LinkedList<>();
        list.add(new Excavator());
        list.add(new Excavator());
        list.add(new Excavator());
        return list;
    }
}
