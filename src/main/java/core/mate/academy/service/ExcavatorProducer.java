package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(5.1));
        excavators.add(new Excavator(4.3));
        excavators.add(new Excavator(3.1));
        return excavators;
    }
}
