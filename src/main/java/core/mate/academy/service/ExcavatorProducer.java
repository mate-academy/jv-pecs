package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> retVal = new ArrayList<>();
        retVal.add(new Excavator("Excavator 0", "Brown", 0.30));
        retVal.add(new Excavator("Excavator 1", "Black", 0.45));
        return retVal;
    }
}
