package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> list;

    public ExcavatorProducer() {
        this.list = new ArrayList<>();
        list.add(new Excavator(true, 1000));
        list.add(new Excavator(true, 1500));
        list.add(new Excavator(true, 2000));
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
