package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("First excavator", "Yellow", 200));
        excavators.add(new Excavator("Second excavator", "Black", 200));
        excavators.add(new Excavator("Third excavator", "Gray", 200));
        excavators.add(new Excavator("Fourth excavator", "White", 200));
        return excavators;
    }
}
