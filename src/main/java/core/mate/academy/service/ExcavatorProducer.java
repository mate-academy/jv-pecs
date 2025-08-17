package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final List<Excavator> EXCAVATOR_LIST = createExcavatorList();

    public List<Excavator> get() {
        return EXCAVATOR_LIST;
    }

    private static List<Excavator> createExcavatorList() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Excavator excavator = new Excavator();
            excavator.setColor("Color" + i);
            excavator.setName("name" + i);
            excavators.add(excavator);
        }
        return excavators;
    }
}
