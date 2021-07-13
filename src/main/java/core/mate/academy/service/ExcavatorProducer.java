package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator twoMExcavator = new Excavator(2);
        Excavator twoAndHalfMExcavator = new Excavator(2.5);
        return List.of(twoMExcavator, twoAndHalfMExcavator);
    }
}
