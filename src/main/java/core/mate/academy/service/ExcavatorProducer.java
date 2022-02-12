package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator = new Excavator();
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        excavators.add(excavator);
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
