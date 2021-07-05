package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("E1", "Neon", 30));
        excavators.add(new Excavator("E2", "Red", 15));
        excavators.add(new Excavator("E3", "Pink", 25));
        return excavators;
    }
}
