package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator1 = new Excavator(16,"Suny", "Black");
        Excavator excavator2 = new Excavator(12, "Ed", "Blue");
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
