package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator 1", "Yellow", 10));
        excavators.add(new Excavator("Excavator 2", "Green", 12));
        excavators.add(new Excavator("Excavator 3", "Blue", 15));
        return excavators;
    }
}
