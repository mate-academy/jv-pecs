package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        Excavator firstExcavator = new Excavator();
        firstExcavator.setName("firstExcavator");
        firstExcavator.setColor("Yellow");
        excavators.add(firstExcavator);

        Excavator secondExcavator = new Excavator();
        secondExcavator.setName("secondExcavator");
        secondExcavator.setColor("Blue");
        excavators.add(secondExcavator);

        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setName("thirdExcavator");
        thirdExcavator.setColor("PerfectBlue");
        excavators.add(thirdExcavator);

        return excavators;
    }
}
