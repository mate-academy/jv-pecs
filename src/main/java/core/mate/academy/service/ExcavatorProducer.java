package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MACHINE_NUMBER = 3;

    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i <= MACHINE_NUMBER; i++) {
            Excavator excavator = new Excavator();
            list.add(excavator);
        }
        return list;
    }
}
