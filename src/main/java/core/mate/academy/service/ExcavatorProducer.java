package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators;

    @Override
    public List<Excavator> get() {
        excavators = new ArrayList<>();
        int index = 0;
        while (index != DEFAULT_MACHINES_AMOUNT) {
            excavators.add(new Excavator());
            index++;
        }
        return excavators;
    }
}
