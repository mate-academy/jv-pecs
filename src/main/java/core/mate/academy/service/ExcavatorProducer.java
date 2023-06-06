package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MACHINE_NUMBER = 3;

    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        List<Excavator> list = new ArrayList<>();
        list.add(excavator);
        list.add(excavator1);
        list.add(excavator2);
        return list;
    }
}
