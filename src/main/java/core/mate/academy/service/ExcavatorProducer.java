package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return createExcavators();
    }

    private List<Excavator> createExcavators() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator 1", "Orange", 5));
        excavators.add(new Excavator("Excavator 2", "Blue", 7));
        return excavators;
    }
}
