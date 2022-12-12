package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        Excavator thirdExcavator = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(firstExcavator);
        excavators.add(secondExcavator);
        excavators.add(thirdExcavator);
        return excavators;
    }
}
