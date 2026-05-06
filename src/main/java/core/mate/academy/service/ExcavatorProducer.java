package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator first = new Excavator();
        Excavator second = new Excavator();

        excavators.add(first);
        excavators.add(second);

        return excavators;
    }
}
