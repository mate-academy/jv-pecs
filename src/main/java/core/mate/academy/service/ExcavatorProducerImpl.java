package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        excavator.setColor("green");
        excavator.setName("big");
        Excavator secondExcavator = new Excavator();
        secondExcavator.setName("small");
        secondExcavator.setColor("red");
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator);
        excavators.add(secondExcavator);
        return excavators;
    }
}
