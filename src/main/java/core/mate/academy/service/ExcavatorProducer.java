package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorList = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        createExcavatorList();
        return excavatorList;
    }

    private void createExcavatorList() {
        for (int i = 0; i < 3; i++) {
            Excavator excavator = new Excavator();
            excavator.setColor("Color" + i);
            excavator.setName("name" + i);
            excavatorList.add(excavator);
        }
    }
}
