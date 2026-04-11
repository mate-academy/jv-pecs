package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();

        list.add(new Excavator(1.25, 7,"стандартный"));
        list.add(new Excavator(1.5, 8,"загребной"));

        return list;
    }
}

