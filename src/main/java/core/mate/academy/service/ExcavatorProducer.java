package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> newExcavators = new ArrayList<>();
        newExcavators.add(new Excavator());
        newExcavators.add(new Excavator());
        newExcavators.add(new Excavator());
        newExcavators.add(new Excavator());
        newExcavators.add(new Excavator());
        newExcavators.add(new Excavator());
        return newExcavators;
    }
}
