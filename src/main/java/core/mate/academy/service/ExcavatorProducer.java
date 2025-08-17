package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator newExcavator = new Excavator("Hyundai", 2020);
        Excavator oldExcavator = new Excavator("CAT", 1999);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(newExcavator);
        excavators.add(oldExcavator);
        return excavators;
    }
}
