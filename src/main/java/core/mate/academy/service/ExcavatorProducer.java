package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        
        Excavator excavator1 = new Excavator();
        excavator1.setScoopType("Mini");
        excavator1.setScoopWeight(1.0);
        excavator1.setScoopActive(true);
        
        Excavator excavator2 = new Excavator();
        excavator2.setScoopType("Mini");
        excavator2.setScoopWeight(1.0);
        excavator2.setScoopActive(true);
        
        Excavator excavator3 = new Excavator();
        excavator3.setScoopType("Mini");
        excavator3.setScoopWeight(1.0);
        excavator3.setScoopActive(true);
        
        return excavators;
    }
}
