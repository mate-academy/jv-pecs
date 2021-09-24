package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        Excavator excavator = new Excavator();
        list.add(excavator);
        return list;
    }
}
