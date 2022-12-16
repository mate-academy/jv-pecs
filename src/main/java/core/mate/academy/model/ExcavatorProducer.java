package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> excavators = new ArrayList<>();
        Excavator firstExcavator = new Excavator(100);
        firstExcavator.setName("First excavator");
        firstExcavator.setColor("Yellow");
        excavators.add(firstExcavator);
        Excavator secondExcavator = new Excavator(110);
        secondExcavator.setName("Second excavator");
        secondExcavator.setColor("Orange");
        excavators.add(secondExcavator);
        return excavators;
    }
}
