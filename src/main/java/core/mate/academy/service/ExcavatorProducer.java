package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator);
        return excavators;
    }
}
