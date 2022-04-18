package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("cyclical", 2.05));
        excavators.add(new Excavator("continuous", 1.08));
        excavators.add(new Excavator("continuous", 1.6));
        return excavators;
    }
}
