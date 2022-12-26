package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        return List.of(firstExcavator, secondExcavator);
    }
}
