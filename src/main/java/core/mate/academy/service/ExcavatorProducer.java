package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<? extends Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("JCB","yellow","loading", 10));
        excavators.add(new Excavator("VOLVO","red","rocky",30));
        excavators.add(new Excavator("HITACHI","blue","trench",5));
        return excavators;
    }
}
