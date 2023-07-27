package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1998));
        excavators.add(new Excavator(2000));
        return excavators;
    }
}
