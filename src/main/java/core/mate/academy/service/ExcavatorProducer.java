package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("First excavator", "white", 2001));
        excavators.add(new Excavator("First excavator", "blue", 2002));
        excavators.add(new Excavator("Third excavator", "red", 2003));
        return excavators;
    }
}
