package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<Excavator>();
        Excavator excavator1 = new Excavator(100);
        excavator1.setName("Excavator 1");
        excavator1.setColor("Yellow");
        excavators.add(excavator1);
        Excavator excavator2 = new Excavator(110);
        excavator2.setName("Excavator 2");
        excavator2.setColor("Orange");
        excavators.add(excavator2);
        return excavators;
    }
}
