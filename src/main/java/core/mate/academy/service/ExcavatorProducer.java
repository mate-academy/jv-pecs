package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list = new ArrayList<>();

    public ExcavatorProducer() {
        list.add(new Excavator(true, "V 2.3"));
        list.add(new Excavator(false, "V 3.0"));
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
