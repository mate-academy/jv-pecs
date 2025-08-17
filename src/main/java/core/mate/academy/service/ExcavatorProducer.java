package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("BigExcavator", "Green", 15));
        excavators.add(new Excavator("MiddleExcavator", "White", 10));
        excavators.add(new Excavator("SmallExcavator", "Black", 3));
        return excavators;
    }
}
