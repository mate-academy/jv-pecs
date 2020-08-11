package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<E extends Machine> implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            excavatorList.add(new Excavator("Medium " + i, "Digger - " + i));
        }
        return excavatorList;
    }
}
