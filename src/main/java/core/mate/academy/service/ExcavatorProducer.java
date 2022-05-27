package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        excavators.add(firstExcavator);
        excavators.add(firstExcavator);
        return excavators;
    }
}
