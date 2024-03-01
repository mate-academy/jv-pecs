package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(5.0, "Excavator-1", "Yellow"));
        excavators.add(new Excavator(7.5, "Excavator-2", "Red"));
        excavators.add(new Excavator(6.3, "Excavator-3", "Green"));
        return excavators;
    }
}
