package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list = new ArrayList<>();

    public ExcavatorProducer() {
        list.add(new Excavator(198));
    }

    public List<Excavator> get() {
        return list;
    }
}
