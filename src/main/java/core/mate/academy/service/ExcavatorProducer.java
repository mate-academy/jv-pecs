package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(800, 1500));
        excavators.add(new Excavator(770, 1800));
        excavators.add(new Excavator(1500, 1900));
        return excavators;
    }
}
