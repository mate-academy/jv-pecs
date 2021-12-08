package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator1 = new Excavator();
        excavators.add(excavator1);
        Excavator excavator2 = new Excavator();
        excavators.add(excavator2);
        Excavator excavator3 = new Excavator();
        excavators.add(excavator3);
        return excavators;
    }
}
