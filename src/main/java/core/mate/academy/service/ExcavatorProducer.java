package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    private List<Excavator> list;

    public ExcavatorProducer() {
        list = new ArrayList<>();
        list.add(new Excavator());
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
