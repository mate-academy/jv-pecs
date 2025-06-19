package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    
    @Override
    public List<Excavator> get() {
        final List<Excavator> excavators = new ArrayList<>();
        Excavator excavator1 = new Excavator();
        excavator1.setScoopType("Mini");
        excavator1.setScoopWeight(1.0);
        excavator1.setScoopActive(true);
        excavators.add(excavator1);
        
        Excavator excavator2 = new Excavator();
        excavator2.setScoopType("Mini");
        excavator2.setScoopWeight(1.0);
        excavator2.setScoopActive(true);
        excavators.add(excavator2);
        
        Excavator excavator3 = new Excavator();
        excavator3.setScoopType("Mini");
        excavator3.setScoopWeight(1.0);
        excavator3.setScoopActive(true);
        excavators.add(excavator3);
        
        return excavators;
    }
}
