package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator first = new Excavator(100);
        Excavator second = new Excavator(70);
        excavators.add(first);
        excavators.add(second);
        return excavators;
    }
}
