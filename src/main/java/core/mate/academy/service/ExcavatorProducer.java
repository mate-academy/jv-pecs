package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        Excavator excavator1 = new Excavator();
        excavator1.setName("Excavator 1");
        excavator1.setColor("Yellow");
        excavators.add(excavator1);

        Excavator excavator2 = new Excavator();
        excavator2.setName("Excavator 2");
        excavator2.setColor("Red");
        excavators.add(excavator2);

        return excavators;
    }
}
