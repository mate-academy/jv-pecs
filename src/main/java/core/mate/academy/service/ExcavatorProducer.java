package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excavator1","black", 20));
        excavators.add(new Excavator("excavator2","blue", 25));
        excavators.add(new Excavator("excavator3","grey", 30));
        return excavators;
    }
}
