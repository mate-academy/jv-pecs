package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(7.8, "Excavator-1", "White"));
        excavators.add(new Excavator(7.2, "Excavator-2", "Red"));
        excavators.add(new Excavator(6.8, "Excavator-3", "Blue"));
        return excavators;
    }
}
